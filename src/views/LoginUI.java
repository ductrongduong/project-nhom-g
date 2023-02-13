package views;

import controllers.LoginController;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hai
 */
public class LoginUI extends javax.swing.JFrame {
    
    private LoginController cont = new  LoginController();
    
    public LoginUI() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Login");
        keyListenner(txbUserName);
        keyListenner(txbPasswd);
    }
    
    // xu ly su kien nhan enter
    private void keyListenner(JTextField jtf) {
        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // neu keycode == 10 ~ enter
                if (e.getKeyCode() == 10) {
                    login();
                }
            }
        }); 
    }

    // dang nhap
    private void login() {
        String userName = txbUserName.getText();
        String password = String.valueOf(txbPasswd.getPassword());
        try {
            if (this.cont.login(userName, password) != 0) {
                dispose();
                MainFrame mainFrame = new MainFrame();
                mainFrame.setLocationRelativeTo(null);
                mainFrame.setResizable(false);
                mainFrame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sai thong tin dang nhap", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!! Vui lòng kiểm tra lại!", "Warning!!", JOptionPane.ERROR_MESSAGE);
        }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnLogin = new javax.swing.JPanel();
        txbUserName = new javax.swing.JTextField();
        txbPasswd = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnLogin.setBackground(new java.awt.Color(102, 102, 102));
        jpnLogin.setForeground(new java.awt.Color(0, 153, 153));
        jpnLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txbUserName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txbUserName.setName("txtUserName"); // NOI18N
        txbUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbUserNameActionPerformed(evt);
            }
        });
        jpnLogin.add(txbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 257, 30));
        txbUserName.getAccessibleContext().setAccessibleName("txtPasswod");

        txbPasswd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txbPasswd.setName("txtPasswd"); // NOI18N
        txbPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txbPasswdActionPerformed(evt);
            }
        });
        jpnLogin.add(txbPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 257, 30));

        btnLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jpnLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 81, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tài khoản:");
        jpnLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 73, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mật khẩu:");
        jpnLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 80, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ĐĂNG NHẬP");
        jpnLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 158, 42));
        jpnLogin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 64, 37, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/istockphoto-1147040712-612x612.jpg"))); // NOI18N
        jpnLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txbUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbUserNameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       this.login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txbPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txbPasswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txbPasswdActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jpnLogin;
    private javax.swing.JPasswordField txbPasswd;
    private javax.swing.JTextField txbUserName;
    // End of variables declaration//GEN-END:variables
}
