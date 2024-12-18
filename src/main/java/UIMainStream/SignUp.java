package UIMainStream;

import Functions.Function;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Models.Account;
import Models.DataBase;
import Models.User;
import javax.swing.ImageIcon;

public class SignUp extends javax.swing.JFrame {

    LogIn loginFrame;
    Account account;
    ImageIcon show;
    ImageIcon hide;
    boolean isHide;

    // SignUp frame's Constructor
    public SignUp() {
        initComponents();
        secondStageinitComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        dateofbirth = new javax.swing.JLabel();
        dateOfBirth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        toLogIn = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        confirmPassword = new javax.swing.JPasswordField();
        message = new javax.swing.JLabel();
        fullName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pass1 = new javax.swing.JLabel();
        pass2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("signup");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("VNI-Book", 2, 14)); // NOI18N
        jLabel1.setText("Welcome Our Company");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout
                                                .createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(logo,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        369,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout
                                                .createSequentialGroup()
                                                .addGap(117, 117, 117)
                                                .addComponent(jLabel1)))
                                .addContainerGap(15, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(logo,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        385,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addContainerGap(49, Short.MAX_VALUE)));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("SIGN UP");

        username.setText("Username");

        dateofbirth.setText("Date of birth");

        jLabel5.setText("Password");

        jLabel6.setText("Confirm Password");

        confirm.setText("Sign Up");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel7.setText("You have an account");

        toLogIn.setText("Login");
        toLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toLogInActionPerformed(evt);
            }
        });

        message.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 51));
        message.setText("jLabel8");
        message.setVisible(false);

        jLabel8.setText("Full name");

        pass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass1MouseClicked(evt);
            }
        });

        pass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout
                                                .createSequentialGroup()
                                                .addGap(162, 162, 162)
                                                .addComponent(confirm))
                                        .addGroup(jPanel3Layout
                                                .createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addGroup(jPanel3Layout
                                                                .createSequentialGroup()
                                                                .addGroup(jPanel3Layout
                                                                        .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                        .addComponent(username,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                63,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(dateofbirth,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                71,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(userName,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                288,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(dateOfBirth)
                                                                        .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                78,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                109,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(password)
                                                                        .addComponent(confirmPassword)
                                                                        .addGroup(jPanel3Layout
                                                                                .createSequentialGroup()
                                                                                .addComponent(jLabel7,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        136,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE)
                                                                                .addComponent(toLogIn)
                                                                                .addGap(12, 12, 12))
                                                                        .addComponent(message,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(fullName))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel3Layout
                                                                        .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(pass1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(pass2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(15, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
                                .createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        85,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel2)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(message)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(username)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userName,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fullName,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateofbirth)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateOfBirth,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel3Layout
                                                                .createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(password,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(pass1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                32,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(confirmPassword,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(pass2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                30,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(confirm)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        11, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(toLogIn))
                                .addGap(52, 52, 52)));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(410, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void secondStageinitComponents() {
        initIcon();

        account = Account.getInstance();
        confirm.setEnabled(false);
        setResizable(false);
        this.setVisible(false);
        this.addEventListener();
}
    private void pass1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_pass1MouseClicked

        if (!isHide) {
            password.setEchoChar((char) 0);
            pass1.setIcon(show);
            isHide = !isHide;
        } else {
            password.setEchoChar('•');
            pass1.setIcon(hide);
            isHide = !isHide;
        }
    }// GEN-LAST:event_pass1MouseClicked

    private void pass2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_pass2MouseClicked

        if (!isHide) {
            confirmPassword.setEchoChar((char) 0);
            pass2.setIcon(show);
            isHide = !isHide;
        } else {
            confirmPassword.setEchoChar('•');
            pass2.setIcon(hide);
            isHide = !isHide;
        }
    }// GEN-LAST:event_pass2MouseClicked
    // ---------------------------------------------------------------
    public boolean bond(LogIn loginFrame) {
        if (loginFrame != null) {
            this.loginFrame = loginFrame;
            return true;
        }
        return false;
    }

    private void initIcon() {
            ImageIcon icon = new ImageIcon(getClass().getResource("/icon/logo.png"));
            this.logo.setIcon(Function.scaleImage(logo, icon));
            isHide = true;
            hide = new ImageIcon(getClass().getResource("/icon/hide.jpg"));
            show = new ImageIcon(getClass().getResource("/icon/show.jpg"));
            pass1.setIcon(hide);
            pass2.setIcon(hide);

    }
    // Button's behaviorous
    private void toLogInActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_toLogInActionPerformed
        this.setVisible(false);

        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
    }// GEN-LAST:event_toLogInActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmActionPerformed

        // Read info from textfield as String and passwordfield as a Stringified char[]
        account.setUsername(this.userName.getText());
        account.setPassword(new String(this.password.getPassword()));

        if (DataBase.accountValidate(account)) {// on signUp unexisting account is good to go.
            JOptionPane.showMessageDialog(rootPane,
                    "ID earning failure! The problem can be of following reasons: \n  > Account existed.\n  > Data Fetching failure.");
        } else {
            DataBase.IdDistributor(account);
            User user = User.getInstance();
            user.initUser(this.fullName.getText(), this.dateOfBirth.getText());// include
                                                                               // saved()

            account.save();

            JOptionPane.showMessageDialog(rootPane, "Bạn đã đăng ký thành công");
            this.setVisible(false);
            loginFrame.setVisible(true);
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        // /* Create and display the form */
        // java.awt.EventQueue.invokeLater(new Runnable() {
        // public void run() {
        // new SignUp().setVisible(true);
        // }
        // });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JTextField dateOfBirth;
    private javax.swing.JLabel dateofbirth;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel message;
    private javax.swing.JLabel pass1;
    private javax.swing.JLabel pass2;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton toLogIn;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

    // private boolean createAccount(String userName, String dateOfBirth, String
    // passwordStr) {
    // // Kiem tra userName co ton tai chua !
    // return true;
    // }
    private void addEventListener() {
        confirmPassword.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkPassword(); // Gọi phương thức kiểm tra mỗi khi văn bản được thay đổi
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkPassword(); // Gọi phương thức kiểm tra khi có ký tự bị xóa
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Phương thức này không được gọi trong trường hợp JPasswordField
                // vì nó không thay đổi định dạng văn bản (chỉ thay đổi nội dung).
            }

            // Phương thức xác nhận mật khẩu
            private void checkPassword() {
                char[] pass = password.getPassword();
                char[] confirmP = confirmPassword.getPassword();
                String passwordStr = new String(pass);
                String confirmStr = new String(confirmP);
                if (passwordStr.length() == 0) {
                    message.setText("Password can't be empty!");
                    message.setVisible(true);

                } else if (!passwordStr.equals(confirmStr)) {
                    message.setText("Password unmatch!");
                    message.setVisible(true);
                } else {
                    confirm.setEnabled(true);
                    message.setVisible(false);
                }
            }
        });
    }


}
