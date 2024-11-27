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

    private TypeITextBox fullName;
    private TypeITextBox dateOfBirth;
    // private TypeITextBox gender;
    private TypeITextBox username;
    private TypeITextBox password;
    private TypeITextBox passwordConfirm;

    private LogInFrame logIn;

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
        this.setBounds(100, 200, 1000, 800);

        // button init
        confirm = new TypeIButton(250, 650, "Confirm");
        toLogIn = new TypeIButton(550, 650, "Log In");
        // input field should be 500in width, since KIM AI failed missurably
        // try to visualizing the layout, like a fking amateur.
        confirm.addActionListener(e -> createAccount());
        toLogIn.addActionListener(e -> toLogIn());
        // and then, just like that I got risk off the
        // event.* imports and interfaces.

        // TODO textfield init

        // Frame combine
        this.add(confirm);
        this.add(toLogIn);
        // this.pack(); Only when you have a layout manager that will
        // size your frame, with null pack() will pack the frame to 0x0
        this.setVisible(false);
    }

    public void bond(LogInFrame logIn) {
        // this.user = user;
        this.logIn = logIn;
    }

    public void createAccount() {
        // get textfield content for account
        account = new Account(username.getText(), password.getText());
        if (account.getValidate()) {
            account.getCurrentUser().setFullName(fullName.getText());
            account.getCurrentUser().setDateOfBirth(dateOfBirth.getText());
            account.save();// TODO
            account.getCurrentUser().save();// TODO
            toMenu();
        } else {
            account = null;
            // popInvalid();
        }
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
        logIn.setVisible(true);
        // reset this textfield too!!
    }
}