package UIMainStream;

public class MainEntry {
    public static void main(String[] args) {
        LogIn logInFrame = new LogIn();
        SignUp signUpFrame = new SignUp();
        logInFrame.pack();
        signUpFrame.pack();
        
        logInFrame.setResizable(false);
        signUpFrame.setResizable(false);

        logInFrame.bond(signUpFrame);
        signUpFrame.bond(logInFrame);
        logInFrame.setLocationRelativeTo(null);
        logInFrame.setVisible(true);
    }
}
