package UIMainStream;

import Functions.ImageFunction;
import Functions.TextFunction;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Models.Account;
import Models.CustomDateEventListener;
import Models.Time;
import Models.User;
import javax.swing.ImageIcon;

public class SignUp extends javax.swing.JFrame implements CustomDateEventListener {

    LogIn loginFrame;
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogoSection = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signUpSection = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        dateofbirth = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        confirmPassword = new javax.swing.JPasswordField();
        message = new javax.swing.JLabel();
        fullName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pass1 = new javax.swing.JLabel();
        pass2 = new javax.swing.JLabel();
        toLogIn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        month = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        dateSeparator = new javax.swing.JLabel();
        dateSeparator1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("signup");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        LogoSection.setBackground(new java.awt.Color(255, 255, 255));
        LogoSection.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("VNI-Book", 2, 14)); // NOI18N
        jLabel1.setText("Book ahead a nice parking plot for your vehicles!");

        javax.swing.GroupLayout LogoSectionLayout = new javax.swing.GroupLayout(LogoSection);
        LogoSection.setLayout(LogoSectionLayout);
        LogoSectionLayout.setHorizontalGroup(
                LogoSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LogoSectionLayout.createSequentialGroup()
                                .addGroup(
                                        LogoSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(LogoSectionLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(LogoSectionLayout.createSequentialGroup()
                                                        .addGap(50, 50, 50)
                                                        .addComponent(jLabel1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        LogoSectionLayout.setVerticalGroup(
                LogoSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LogoSectionLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 400,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addContainerGap(51, Short.MAX_VALUE)));

        jPanel1.add(LogoSection);
        LogoSection.setBounds(0, 0, 420, 500);

        signUpSection.setBackground(new java.awt.Color(255, 255, 255));
        signUpSection.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("SIGN UP");

        username.setText("Username");

        dateofbirth.setText("Date of birth DD/MM/YYYY");

        day.setText("14");

        jLabel5.setText("Password");

        jLabel6.setText("Confirm Password");

        confirm.setBackground(new java.awt.Color(102, 102, 102));
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Sign Up");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("You already have an account ?");

        message.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 51));
        message.setText("message label");
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

        toLogIn.setBackground(new java.awt.Color(102, 102, 102));
        toLogIn.setForeground(new java.awt.Color(255, 255, 255));
        toLogIn.setText("Log In?");
        toLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toLogInActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        month.setText("11");

        year.setText("1449");

        dateSeparator.setText("/");

        dateSeparator1.setText("/");

        javax.swing.GroupLayout signUpSectionLayout = new javax.swing.GroupLayout(signUpSection);
        signUpSection.setLayout(signUpSectionLayout);
        signUpSectionLayout.setHorizontalGroup(
                signUpSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signUpSectionLayout.createSequentialGroup()
                                .addGroup(signUpSectionLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(signUpSectionLayout.createSequentialGroup()
                                                .addGap(162, 162, 162)
                                                .addComponent(confirm))
                                        .addGroup(signUpSectionLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(signUpSectionLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(dateofbirth,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 71,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(signUpSectionLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                .addComponent(fullName,
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(userName,
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(message,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(username,
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 280,
                                                                        Short.MAX_VALUE)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                        signUpSectionLayout.createSequentialGroup()
                                                                                .addComponent(day,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        40,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(dateSeparator)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(month,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        40,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(dateSeparator1)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(year,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        40,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jSeparator1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 280,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(signUpSectionLayout.createSequentialGroup()
                                                                .addGroup(signUpSectionLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                280, Short.MAX_VALUE)
                                                                        .addComponent(confirmPassword,
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(password,
                                                                                javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(signUpSectionLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(pass2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(pass1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(signUpSectionLayout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpSectionLayout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(toLogIn)))
                                .addContainerGap(17, Short.MAX_VALUE)));
        signUpSectionLayout.setVerticalGroup(
                signUpSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signUpSectionLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(message)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(username)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fullName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateofbirth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(signUpSectionLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dateSeparator)
                                        .addComponent(dateSeparator1))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(signUpSectionLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(signUpSectionLayout.createSequentialGroup()
                                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(signUpSectionLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(confirmPassword,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(confirm)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14,
                                                        Short.MAX_VALUE)
                                                .addGroup(signUpSectionLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(toLogIn))
                                                .addGap(52, 52, 52))
                                        .addGroup(signUpSectionLayout.createSequentialGroup()
                                                .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));

        jPanel1.add(signUpSection);
        signUpSection.setBounds(420, 0, 380, 500);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void secondStageinitComponents() {
        initIcon();

        confirm.setEnabled(false);
        setResizable(false);
        this.setVisible(false);
        this.addEventListener();
        this.addCustomDateEventListener();
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
        this.logo.setIcon(ImageFunction.scaleImage(logo, icon));
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
        // include saved()
        boolean isAdmin = false;
        if (userName.getText().toLowerCase().equals("admin")) 
            isAdmin = true;
            
        Time dateOfBirth = new Time(0, 0, Integer.parseInt(day.getText()), Integer.parseInt(month.getText()),
        Integer.parseInt(year.getText()));
        boolean createAccount = Account.getInstance().initAccount(userName.getText(), new String(this.password.getPassword()), new Time(), isAdmin);
        boolean createUser = User.getInstance().initUser(fullName.getText(), dateOfBirth, isAdmin);
        if(createAccount && createUser){
            // message
            JOptionPane.showMessageDialog(rootPane, "Bạn đã đăng ký thành công");
            this.setVisible(false);
            loginFrame.setVisible(true);
            User.clearInstance();
            Account.clearInstance();
        } else
        JOptionPane.showMessageDialog(rootPane,
                        "ID earning failure! The problem can be of following reasons: \n  > Account existed.\n  > Data Fetching failure.");

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogoSection;
    private javax.swing.JButton confirm;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel dateSeparator;
    private javax.swing.JLabel dateSeparator1;
    private javax.swing.JLabel dateofbirth;
    private javax.swing.JTextField day;
    private javax.swing.JTextField fullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel message;
    private javax.swing.JTextField month;
    private javax.swing.JLabel pass1;
    private javax.swing.JLabel pass2;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel signUpSection;
    private javax.swing.JButton toLogIn;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel username;
    private javax.swing.JTextField year;
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

    @Override
    public void addCustomDateEventListener() {
        TextFunction.addDateInputClamper(day, 1, month, year, 2);
        TextFunction.addDateInputClamper(month, 1, 12, 2);
        TextFunction.addDateInputClamper(year, new Time().getYear(), 2030, 4);
        // overkill, but meh.
    }
}
