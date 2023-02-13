/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.PhanAnhManagerFrame;

import Bean.NhanKhauBean;
import controllers.PhanAnhManagerController.ThemMoiController;
import java.awt.event.WindowAdapter;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.PhanAnhModel;

/**
 *
 * @author PV
 */
public class ChinhSuaPhanAnh extends javax.swing.JFrame {
    private JFrame parentFrame;
//    private DangKyTamTruController controller;
//    private TamTruModel tamTruModel;
    private PhanAnhModel phanAnhModel;
    private NhanKhauBean nhanKhauBean;
    private ThemMoiController controller;
    /**
     * Creates new form DangKyTamTruJFrame
     */
    public ChinhSuaPhanAnh() {
        initComponents();
    }

    public ChinhSuaPhanAnh(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
//        this.controller = new DangKyTamTruController();
        this.phanAnhModel=new PhanAnhModel();
        this.nhanKhauBean=new NhanKhauBean();
        this.controller=new ThemMoiController();
        phanAnhModel.setPhanLoai("Chưa rõ");
        phanAnhModel.setTrangThai("Chưa rõ");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setTitle("Thêm người phản ánh mới");
        this.parentFrame.setEnabled(false);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                close();
            }
            
        });
    }
    
    void close() {
        if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(null, "Are you sure to close?", "Warning!!", JOptionPane.YES_NO_OPTION)) {
            this.parentFrame.setEnabled(true);
            dispose();
        }
    }

    private boolean checkNhanKhauID(String id) {
        if (id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập nhân khẩu ID", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            try {
                long temp = Long.parseLong(id);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng nhân khẩu ID!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        return true;
    }
    
    public void setDataNhanKhau(){
        jTextFieldNhanKhauID.setText(String.valueOf(nhanKhauBean.getNhanKhauModel().getID()));
        jTextFieldNhanKhauID.setEditable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ngaybatdau = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldTrangThai = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldPhanLoai = new javax.swing.JComboBox<>();
        jTextFieldNhanKhauID = new javax.swing.JTextField();
        jTextFieldNoiDung = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPhanAnhID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nhân khẩu ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Nội dung");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        ngaybatdau.setEnabled(false);
        jPanel1.add(ngaybatdau, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 378, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Ngày phản ánh:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("(*)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, 30));

        acceptBtn.setText("Xác nhận");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });
        jPanel1.add(acceptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 80, -1));

        cancelBtn.setText("Hủy");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 80, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Phân loại");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 30));

        jTextFieldTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mới ghi nhận", "Chưa giải quyết", "Đã giải quyết" }));
        jTextFieldTrangThai.setFont(new java.awt.Font("Arial", 0, 14));
        jTextFieldTrangThai.setBackground(Color.WHITE);
        jTextFieldTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTrangThaiActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 378, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Trạng thái");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 30));

        jTextFieldPhanLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phản ánh", "Kiến nghị", "Khiếu nại" }));
        jTextFieldPhanLoai.setFont(new java.awt.Font("Arial", 0, 14));
        jTextFieldPhanLoai.setBackground(Color.WHITE);
        jTextFieldPhanLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhanLoaiActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPhanLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 378, 30));

        jTextFieldNhanKhauID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNhanKhauID.setEnabled(true);
        jTextFieldNhanKhauID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNhanKhauIDActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNhanKhauID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 378, 30));

        jTextFieldNoiDung.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNoiDung.setEnabled(true);
        jTextFieldNoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoiDungActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 378, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Phản ánh ID:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jTextFieldPhanAnhID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldPhanAnhID.setEnabled(true);
        jTextFieldPhanAnhID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhanAnhIDActionPerformed(evt);
            }
        });
        jTextFieldPhanAnhID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPhanAnhIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPhanAnhIDKeyTyped(evt);
            }
        });
        jPanel1.add(jTextFieldPhanAnhID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 378, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        if (validateForm()) {
            PhanAnhModel phanAnhModel = new PhanAnhModel(Integer.parseInt(this.jTextFieldPhanAnhID.getText()),
            Integer.parseInt(this.jTextFieldNhanKhauID.getText()),
            this.ngaybatdau.getDate(),
            this.jTextFieldNoiDung.getText(),
            this.jTextFieldPhanLoai.getItemAt(jTextFieldPhanLoai.getSelectedIndex()),
            this.jTextFieldTrangThai.getItemAt(jTextFieldTrangThai.getSelectedIndex()));
            if (controller.changeStatusPhanAnh(phanAnhModel)) {
                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                    this.parentFrame.setEnabled(true);
                    dispose();
            };
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng các trường bắt buộc!", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        close();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void jTextFieldTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTrangThaiActionPerformed
        // TODO add your handling code here:
        phanAnhModel.setTrangThai((String)jTextFieldTrangThai.getSelectedItem());
    }//GEN-LAST:event_jTextFieldTrangThaiActionPerformed

    private void jTextFieldPhanLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhanLoaiActionPerformed
        phanAnhModel.setPhanLoai((String)jTextFieldPhanLoai.getSelectedItem());

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhanLoaiActionPerformed

    private void jTextFieldNhanKhauIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNhanKhauIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNhanKhauIDActionPerformed

    private void jTextFieldNoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNoiDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoiDungActionPerformed

    private void jTextFieldPhanAnhIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhanAnhIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhanAnhIDActionPerformed

    private void jTextFieldPhanAnhIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhanAnhIDKeyTyped
        // TODO add your handling code here:
//        if (this.jTextFieldPhanAnhID.getText().equals("")) {
//            System.out.println("30444444444444 : " + jTextFieldPhanAnhID.getText());
//            return;
//        }
//        PhanAnhModel phanAnhModel= controller.getPhanAnhById(Integer.parseInt(jTextFieldPhanAnhID.getText()));
//        if (phanAnhModel == null) {
//            this.jTextFieldNhanKhauID.setText("");
////            this.jTextFieldTenNhanKhau.setText("");
//            this.jTextFieldNoiDung.setText("");
//        } else {
//            this.jTextFieldNhanKhauID.setText("" + phanAnhModel.getNhanKhauID());
////            this.jTextFieldTenNhanKhau.setText(phanAnhModel.g);
//            this.jTextFieldNoiDung.setText(phanAnhModel.getNoiDung());
//            this.jTextFieldPhanLoai.setSelectedItem(phanAnhModel.getPhanLoai());
//            this.jTextFieldTrangThai.setSelectedItem(phanAnhModel.getTrangThai());
//            
//        }
    }//GEN-LAST:event_jTextFieldPhanAnhIDKeyTyped

    private void jTextFieldPhanAnhIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhanAnhIDKeyReleased
        // TODO add your handling code here:
        if (this.jTextFieldPhanAnhID.getText().equals("")) {
            return;
        }
        PhanAnhModel phanAnhModel= controller.getPhanAnhById(Integer.parseInt(jTextFieldPhanAnhID.getText()));
        if (phanAnhModel == null) {
            this.jTextFieldNhanKhauID.setText("");
//            this.jTextFieldTenNhanKhau.setText("");
            this.jTextFieldNoiDung.setText("");
        } else {
            this.jTextFieldNhanKhauID.setText("" + phanAnhModel.getNhanKhauID());
//            this.jTextFieldTenNhanKhau.setText(phanAnhModel.g);
            this.jTextFieldNoiDung.setText(phanAnhModel.getNoiDung());
            this.jTextFieldPhanLoai.setSelectedItem(phanAnhModel.getPhanLoai());
            this.jTextFieldTrangThai.setSelectedItem(phanAnhModel.getTrangThai());
            
        }
    }//GEN-LAST:event_jTextFieldPhanAnhIDKeyReleased
    private boolean validateForm() {
        return true;
    }
     private boolean checknhanKhauID() {
        try {
            long l=Long.valueOf(jTextFieldNhanKhauID.getText());
            if(l<0)return false;
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChinhSuaPhanAnh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChinhSuaPhanAnh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChinhSuaPhanAnh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChinhSuaPhanAnh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChinhSuaPhanAnh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNhanKhauID;
    private javax.swing.JTextField jTextFieldNoiDung;
    private javax.swing.JTextField jTextFieldPhanAnhID;
    private javax.swing.JComboBox<String> jTextFieldPhanLoai;
    private javax.swing.JComboBox<String> jTextFieldTrangThai;
    private com.toedter.calendar.JDateChooser ngaybatdau;
    // End of variables declaration//GEN-END:variables
}
