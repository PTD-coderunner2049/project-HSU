package UIMainStream;

public class MainEntry {
    public static void main(String[] args) {
        Login logInFrame = new Login();
        SignUp signUpFrame = new SignUp();
        logInFrame.pack();
        signUpFrame.pack();

        logInFrame.bond(signUpFrame);
        signUpFrame.bond(logInFrame);
        logInFrame.setLocationRelativeTo(null);
        logInFrame.setVisible(true);
    }
}
