// This is similar to SignIn frame, but less notes.
// Why dont I combine all my frame to one and let them inheritance from it?
// Yeah try it. Me? I wont. "Prefer Composition over Inheritance"
// (fact: I fcked up trying)
package Utils.Frames;

import javax.swing.JFrame;

import Components.Account;
import Utils.Buttons.*;
import Utils.TextBoxs.*;

@SuppressWarnings("unused")
public class LogInFrame extends JFrame {

    private Account account;

    private TypeIButton confirm, toSignUp;
    private TypeITextBox usernameText, passwordText;

    private SignUpFrame signUp;

    private int marginX = 220;
    private int marginY = 10;
    private int textMargin = 10;
    private int pace = 5;

    public LogInFrame() {

        // frame init
        setTitle("control: Loging in");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setBounds(800, 300, 400, 130);
        // button init
        confirm = new TypeIButton(marginX, marginY + (TypeIButton.height + pace) * 0, "Confirm");
        toSignUp = new TypeIButton(marginX, marginY + (TypeIButton.height + pace) * 1, "Sign Up?");
        confirm.addActionListener(e -> toMenu());
        toSignUp.addActionListener(e -> toSignUp());

        // textfield init
        usernameText = new TypeITextBox(textMargin, textMargin + (TypeITextBox.height + pace) * 0, "Username");
        passwordText = new TypeITextBox(textMargin, textMargin + (TypeITextBox.height + pace) * 1, "Password");

        // Frame combine
        add(confirm);
        add(toSignUp);
        add(usernameText);
        add(passwordText);

        setVisible(false);
    }

    public void bond(SignUpFrame signUp) {
        this.signUp = signUp;
    }

    private void toMenu() {
        account = new Account(usernameText.getText(), passwordText.getText());
        if (account.getValidate()) {
            // getValidate bc it is slow to run isValid twice
            // "already run once on default account constructor"
            UserMenu menu = (account.isAdmin()) ? new UserMenu() : new UserMenu(account.getCurrentUser());
            menu.setVisible(true);
            dispose();
        }
    }

    // button listeners for sign up option
    private void toSignUp() {
        setVisible(false);
        signUp.setLocation(800, 300);
        signUp.setVisible(true);
        // reset this textfield too!!
    }
}