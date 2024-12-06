package UIMainStream;

import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Models.Account;
import Models.DataBase;

public class SignUp extends javax.swing.JFrame {

    LogIn loginFrame;
    Account account;

    // SignUp frame's Constructor
    public SignUp() {
        initComponents();

        account = new Account();
        confirm.setEnabled(false);
        this.setVisible(false);
        this.addEventListener();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("signup");
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(113, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(107, 107, 107)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel1)
                                .addContainerGap(187, Short.MAX_VALUE)));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Sign Up");

        jLabel3.setText("Username");

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Date of birth");

        dateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateOfBirthActionPerformed(evt);
            }
        });

        jLabel5.setText("Password");

        jLabel6.setText("Confirm Password");

        confirm.setText("Sign Up");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    confirmActionPerformed(evt);
                } catch (HeadlessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        jLabel7.setText("You have an account");

        toLogIn.setText("Login");
        toLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toLogInActionPerformed(evt);
            }
        });

        password.setText("jPasswordField3");

        confirmPassword.setText("jPasswordField4");

        message.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 51));
        message.setText("jLabel8");
        message.setVisible(false);

        jLabel8.setText("Full name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(145, 145, 145)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(162, 162, 162)
                                                .addComponent(confirm))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addGroup(jPanel3Layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(jLabel3,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel4,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 71,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(userName,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 288,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(dateOfBirth)
                                                                .addComponent(jLabel5,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 78,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel6,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 109,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(password)
                                                                .addComponent(confirmPassword)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
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
                                                                .addComponent(fullName)))))
                                .addContainerGap(58, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2)
                                .addGap(14, 14, 14)
                                .addComponent(message)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15,
                                        Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 122, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 72, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ---------------------------------------------------------------
    // Bonding
    public boolean bond(LogIn loginFrame) {
        if (loginFrame != null) {
            this.loginFrame = loginFrame;
            return true;
        }
        return false;
    }

    // Button's behaviorous
    private void toLogInActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_toLogInActionPerformed
        this.setVisible(false);

        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
    }// GEN-LAST:event_toLogInActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) throws HeadlessException, IOException {// GEN-FIRST:event_confirmActionPerformed

        // Read info from textfield as String and passwordfield as a Stringified char[]
        account.setUsername(this.userName.getText());
        account.setPassword(new String(this.password.getPassword()));
        account.save();
        // if (!account.isExist()) {// on signUp unexisting account is good to go.
        // DataBase.IdDistributor(account);
        // if (account.getId() == null) {
        // JOptionPane.showMessageDialog(rootPane,
        // "Backend: ID earning failure!!!\n Dude! you forgot to build the ID
        // generator.");
        // } else {
        // account.initUser(this.fullName.getText(), this.dateOfBirth.getText());
        // // included save() for user;
        // account.setValidate(true);
        // account.save();

        // JOptionPane.showMessageDialog(rootPane, "Bạn đã đăng ký thành công");
        // this.setVisible(false);
        // loginFrame.setVisible(true);
        // }
        // }
    }

    private void dateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dateOfBirthActionPerformed
    }// GEN-LAST:event_dateOfBirthActionPerformed

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_userNameActionPerformed
    }// GEN-LAST:event_userNameActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel message;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton toLogIn;
    private javax.swing.JTextField userName;
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
