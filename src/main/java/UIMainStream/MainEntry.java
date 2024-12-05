package UIMainStream;

public class MainEntry {
    public static void main(String[] args) {
        Login logInFrame = new Login();
        SignUp signUpFrame = new SignUp();

        logInFrame.bond(signUpFrame);
        signUpFrame.bond(logInFrame);

        logInFrame.setVisible(true);
    }
}
