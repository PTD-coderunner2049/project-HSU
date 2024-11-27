// This is similar to SignIn frame, but less notes.
// Why dont I combine all my frame to one and let them inheritance from it?
// Yeah try it. Me? I wont. "Prefer Composition over Inheritance"
// (fact: I fcked up trying)
package Utils.Frames;

import javax.swing.JFrame;

import Components.Account;
import Utils.Buttons.*;
import Utils.TextBoxs.*;

@SuppressWarnings("unused") // this notation is self explained already.
public class LogInFrame extends JFrame {

    private Account account;

    private TypeIButton confirm, toSignUp;
    private TypeITextBox usernameText, passwordText;

    private SignUpFrame signUp;
    // TODO consider make new frame for textfield only, Grid layout and configure it
    // here instead, set number of field and context of each, you can then write
    // thatframe.thattextfield.addActionListener(e -> doingsomeshits);

    public LogInFrame() {

        // frame init
        setTitle("control: Loging in");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setBounds(100, 200, 1000, 800);

        // button init
        confirm = new TypeIButton(250, 450, "Confirm");
        toSignUp = new TypeIButton(550, 450, "Sign Up");
        confirm.addActionListener(e -> toMenu());
        toSignUp.addActionListener(e -> toSignUp());

        // TODO textfield init
        usernameText = new TypeITextBox();
        passwordText = new TypeITextBox();

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
            this.dispose();
        }
    }

    // button listeners for sign up option
    private void toSignUp() {
        this.setVisible(false);
        signUp.setVisible(true);
        // reset this textfield too!!
    }
}