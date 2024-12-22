package UIMainStream;

import Functions.ImageFunction;
import javax.swing.JOptionPane;

import Models.Account;
import Models.DataBase;
import Models.User;
import UIMainStream.DashBoard.DashBoardFrame;
import javax.swing.ImageIcon;

// vdkdjiewdkjfhfhd
//// 
public class LogIn extends javax.swing.JFrame {

    SignUp signupFrame;
    ImageIcon show;
    ImageIcon hide;
    boolean isHide;

    // Login Frame's Constructor
    public LogIn() {
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
        LogoSection = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LogInSection = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        toSignUp = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        message = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        LogoSection.setBackground(new java.awt.Color(255, 255, 255));
        LogoSection.setMinimumSize(new java.awt.Dimension(400, 500));
        LogoSection.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setFont(new java.awt.Font("VNI-Book", 2, 14)); // NOI18N
        jLabel5.setText("Book ahead a nice parking plot for your vehicles!");

        javax.swing.GroupLayout LogoSectionLayout = new javax.swing.GroupLayout(LogoSection);
        LogoSection.setLayout(LogoSectionLayout);
        LogoSectionLayout.setHorizontalGroup(
                LogoSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LogoSectionLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoSectionLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));
        LogoSectionLayout.setVerticalGroup(
                LogoSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LogoSectionLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addContainerGap(51, Short.MAX_VALUE)));

        jPanel1.add(LogoSection);
        LogoSection.setBounds(0, 0, 420, 500);

        LogInSection.setBackground(new java.awt.Color(255, 255, 255));
        LogInSection.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 255));
        jLabel1.setText("LOGING IN");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        confirm.setBackground(new java.awt.Color(102, 102, 102));
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Login");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("You don't have an account yet?");

        toSignUp.setBackground(new java.awt.Color(102, 102, 102));
        toSignUp.setForeground(new java.awt.Color(255, 255, 255));
        toSignUp.setText("Sign up now!");
        toSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toSignUpActionPerformed(evt);
            }
        });

        message.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 102));
        message.setText("Hello");
        message.setVisible(false);

        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LogInSectionLayout = new javax.swing.GroupLayout(LogInSection);
        LogInSection.setLayout(LogInSectionLayout);
        LogInSectionLayout.setHorizontalGroup(
                LogInSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogInSectionLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140))
                        .addGroup(LogInSectionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(toSignUp)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(LogInSectionLayout.createSequentialGroup()
                                .addGroup(LogInSectionLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(LogInSectionLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(LogInSectionLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(LogInSectionLayout.createSequentialGroup()
                                                                .addComponent(password,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 280,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(pass,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(LogInSectionLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addComponent(message,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(userName,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 280,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jLabel3,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jLabel2,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))))
                                        .addGroup(LogInSectionLayout.createSequentialGroup()
                                                .addGap(148, 148, 148)
                                                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 72,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(11, Short.MAX_VALUE)));
        LogInSectionLayout.setVerticalGroup(
                LogInSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LogInSectionLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(message)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(LogInSectionLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(confirm)
                                .addGap(18, 18, 18)
                                .addGroup(LogInSectionLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(toSignUp))
                                .addContainerGap(173, Short.MAX_VALUE)));

        confirm.getAccessibleContext().setAccessibleName("login");

        jPanel1.add(LogInSection);
        LogInSection.setBounds(420, 0, 380, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void secondStageinitComponents() {
        initIcon();
        setResizable(false);
        this.setVisible(false);
    }

    private void passMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_passMouseClicked
        if (!isHide) {
            password.setEchoChar((char) 0);
            pass.setIcon(show);
            isHide = !isHide;
        } else {
            password.setEchoChar('•');
            pass.setIcon(hide);
            isHide = !isHide;
        }
    }// GEN-LAST:event_passMouseClicked
     // ---------------------------------------------------------------

    public boolean bond(SignUp signupFrame) {
        if (signupFrame != null) {
            this.signupFrame = signupFrame;
            return true;
        }
        return false;
    }

    private void initIcon() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/logo.png"));
        this.Logo.setIcon(ImageFunction.scaleImage(Logo, icon));
        isHide = true;
        hide = new ImageIcon(getClass().getResource("/icon/hide.jpg"));
        show = new ImageIcon(getClass().getResource("/icon/show.jpg"));
        pass.setIcon(hide);
    }

    // Button's behaviorous
    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmActionPerformed
        Account account = Account.getInstance();
        // Read info from textfield as String and passwordfield as a Stringified char[]
        account.setUsername(this.userName.getText());
        account.setPassword(new String(this.password.getPassword()));

        if (!DataBase.accountValidate(account)) {// IF account exist, go to dashboard
            account.reconstruct();// pull id only :)) other already there after user type in right
            User user = User.getInstance();
            user.setId(account.getId());
            user.reconstruct();

            DashBoardFrame dashboard = DashBoardFrame.getInstance();
            dashboard.setVisible(true);
            dashboard.setLocationRelativeTo(null);

            signupFrame.dispose();
            this.dispose();
            JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công!");
        } else {
            message.setText("INVALID");
            message.setVisible(true);
        }
    }

    private void toSignUpActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_toSignUpActionPerformed
        this.setVisible(false);

        signupFrame.setVisible(true);
        signupFrame.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(
                    LogIn.class.getName()).log(java.util.logging.Level.SEVERE,
                            null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(
                    LogIn.class.getName()).log(java.util.logging.Level.SEVERE,
                            null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(
                    LogIn.class.getName()).log(java.util.logging.Level.SEVERE,
                            null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(
                    LogIn.class.getName()).log(java.util.logging.Level.SEVERE,
                            null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogInSection;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel LogoSection;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel message;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton toSignUp;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
