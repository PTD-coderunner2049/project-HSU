package Utils.Frames;

import javax.swing.JFrame;

import Components.Account;
import Utils.Buttons.*;
import Utils.TextBoxs.*;

@SuppressWarnings("unused") // this notation is self explained already.
public class SignUpFrame extends JFrame {

    private Account account;

    private TypeIButton confirm;
    private TypeIButton toLogIn;

    private TypeITextBox fullNameText;
    private TypeITextBox dateOfBirthText;
    // private TypeITextBox gender;
    private TypeITextBox usernameText;
    private TypeITextBox passwordText;
    private TypeITextBox passwordConfirmText;

    private LogInFrame logIn;

    private int marginX = 220;
    private int marginY = 10;
    private int textMargin = 10; // 10 and 10 pixel from top left corner
    private int pace = 5;

    /*
     * 2 input box, 2 botton OK & SignUp...
     * No, let left the button listener in main.
     * so user can cycle log and sign as much they wanted.
     * I ran into a problem to make that possible when I try to
     * let one of the frames access the other frame visibility().
     * ok that wouldnt work either. i will actively bond these
     * two frames together on start up. bond() is created.
     * Update in Class diagram please.
     */

    public SignUpFrame() {
        // note that all "this." is unecessary, we only have one JFrame here
        // I can just call thouse function without need of "this."
        // I did! in Login frame. for study purposed.

        // frame init
        this.setTitle("control: Signing Up? ok, be quick bro.");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setBounds(800, 300, 400, 250);

        // button init
        confirm = new TypeIButton(marginX, marginY + (TypeIButton.height + pace) * 0, "Confirm");
        toLogIn = new TypeIButton(marginX, marginY + (TypeIButton.height + pace) * 1, "Log In?");
        // input field should be 200 in width, since KIM AI failed missurably
        // try to visualizing the layout, like a fking amateur.
        confirm.addActionListener(e -> createAccount());
        toLogIn.addActionListener(e -> toLogIn());
        // and then, just like that I got risk off the
        // event.* imports and interfaces.

        // textfield init
        usernameText = new TypeITextBox(textMargin, textMargin + (TypeITextBox.height + pace) * 0, "Username");
        fullNameText = new TypeITextBox(textMargin, textMargin + (TypeITextBox.height + pace) * 1, "Full Name");
        dateOfBirthText = new TypeITextBox(textMargin, textMargin + (TypeITextBox.height + pace) * 2, "Date of Birth");
        passwordText = new TypeITextBox(textMargin, textMargin + (TypeITextBox.height + pace) * 3, "Password");
        passwordConfirmText = new TypeITextBox(textMargin, textMargin + (TypeITextBox.height + pace) * 4,
                "Password Confirm");
        // Frame combine
        this.add(confirm);
        this.add(toLogIn);
        this.add(usernameText);
        this.add(fullNameText);
        this.add(dateOfBirthText);
        this.add(passwordText);
        this.add(passwordConfirmText);
        // this.pack(); Only when you have a layout manager that will
        // size your frame, with null pack() will pack the frame to 0x0
        this.setVisible(false);
    }

    public void bond(LogInFrame logIn) {
        // this.user = user;
        this.logIn = logIn;
    }

    public void textInit() {
    }

    public boolean passwordMisMatch() {
        return passwordText.getText() != passwordConfirmText.getText();
    }

    public boolean createAccount() {
        // get textfield content for account
        if (passwordMisMatch()) {
            // TODO pop up window when password confirm doesn't match.
            return false;
        }
        account = new Account(usernameText.getText(), passwordText.getText());
        if (!account.getValidate()) {
            // TODO popInvalid();
            account = null;
            return false;
        }
        account.getCurrentUser().setFullName(fullNameText.getText());
        account.getCurrentUser().setDateOfBirth(dateOfBirthText.getText());
        // TODO account.save();
        // TODO account.getCurrentUser().save();
        toMenu();
        return true;

    }

    private void toMenu() {
        if (!account.getValidate()) {
            // user isvalid mean exist, on sign in, unexist is the criterion for confirm.
            // criteria is plural of criterion btw. noted that.
            UserMenu menu = new UserMenu(account.getCurrentUser());
            // (userAccount.is_admin()) ? new UserMenu().setVisible(true) : new
            // UserMenu(user).setVisible(true);(too hard to read, but legit)
            menu.setVisible(true);
            this.dispose();
        } else {
            // TODO window pop up account invalid
            // popInvalid();
        }
    }

    private void toLogIn() {
        this.setVisible(false);
        logIn.setLocation(800, 300);
        logIn.setVisible(true);
        // reset this textfield too!!
    }
}