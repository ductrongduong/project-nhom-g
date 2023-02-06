package views;
import controllers.XetNghiemPanelController;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import views.XetNghiemManagerFrame.ThemMoiXetNghiem;
/**
 *
 * @author Dat
 */
public class XetNghiemManagePanel extends javax.swing.JPanel {

    private String field="nhanKhauID";
    private Map<String,String> map;
    private XetNghiemPanelController controller;
    private JFrame parentJFrame;
    public XetNghiemManagePanel(JFrame parentFrame) {
        map= new HashMap<String,String>();
        map.put("Xét nghiệm ID", "xetNghiemID");
        map.put("Nhân khẩu ID", "nhanKhauID");
        map.put("Ngày xét nghiệm", "ngayXetNghiem");
        map.put("Tên nhân khẩu", "hoTen");
        map.put("Nơi xét nghiệm", "noiXetNghiem");
        map.put("Hình thức", "hinhThucXetNghiem");
        map.put( "Kết quả", "ketQuaXetNghiem");
        this.parentJFrame = parentFrame;
        initComponents();
        controller = new XetNghiemPanelController(this.tablePanel,this.jtfsoLuong);
        controller.setParentJFrame(this.parentJFrame);
        controller.setDataTable();
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
        jTextFieldValue = new javax.swing.JTextField();
        tablePanel = new javax.swing.JPanel();
        themMoiBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Ngay1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        Ngay2 = new com.toedter.calendar.JDateChooser();
        jtfsoLuong = new javax.swing.JTextField();
        thongKeBtn = new javax.swing.JButton();
        jComboBoxField = new javax.swing.JComboBox<>();
        timiBtn = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jCheckBoxhinhthuc1 = new javax.swing.JCheckBox();
        jCheckBoxhinhthuc2 = new javax.swing.JCheckBox();
        jCheckBoxketqua2 = new javax.swing.JCheckBox();
        jCheckBoxketqua1 = new javax.swing.JCheckBox();
        resetBtn1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(855, 570));

        jTextFieldValue.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValueActionPerformed(evt);
            }
        });

        tablePanel.setPreferredSize(new java.awt.Dimension(817, 330));

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 817, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        themMoiBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        themMoiBtn.setText("Thêm mới");
        themMoiBtn.setPreferredSize(new java.awt.Dimension(95, 30));
        themMoiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themMoiBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Ngày bắt đầu:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Từ: ");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Số lượng");

        Ngay1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Đến: ");

        Ngay2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtfsoLuong.setEditable(false);
        jtfsoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfsoLuongActionPerformed(evt);
            }
        });

        thongKeBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        thongKeBtn.setText("Thống kê");
        thongKeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongKeBtnActionPerformed(evt);
            }
        });

        jComboBoxField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân khẩu ID", "Tên nhân khẩu"}));
        jComboBoxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFieldActionPerformed(evt);
            }
        });

        timiBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        timiBtn.setText("Tìm kiếm");
        timiBtn.setPreferredSize(new java.awt.Dimension(53, 30));
        timiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timiBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Hình thức xét nghiệm");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Kết quả xét nghiệm");

        jCheckBoxhinhthuc1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxhinhthuc1.setText("Test nhanh");
        jCheckBoxhinhthuc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxhinhthuc1ActionPerformed(evt);
            }
        });

        jCheckBoxhinhthuc2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxhinhthuc2.setText("PCR");
        jCheckBoxhinhthuc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxhinhthuc2ActionPerformed(evt);
            }
        });

        jCheckBoxketqua2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxketqua2.setActionCommand("Âm tính");
        jCheckBoxketqua2.setLabel("Âm tính");
        jCheckBoxketqua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxketqua2ActionPerformed(evt);
            }
        });

        jCheckBoxketqua1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCheckBoxketqua1.setActionCommand("Dương tính");
        jCheckBoxketqua1.setLabel("Dương tính");
        jCheckBoxketqua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxketqua1ActionPerformed(evt);
            }
        });

        resetBtn1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        resetBtn1.setText("Làm lại");
        resetBtn1.setPreferredSize(new java.awt.Dimension(65, 30));
        resetBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(themMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ngay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ngay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBoxketqua1)
                                            .addComponent(jCheckBoxhinhthuc1)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jCheckBoxhinhthuc2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxketqua2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfsoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(thongKeBtn)
                                .addGap(17, 17, 17))))
                    .addComponent(tablePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxField)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(themMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ngay1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Ngay2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxhinhthuc1))
                        .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBoxhinhthuc2))
                    .addComponent(jtfsoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thongKeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBoxketqua2)
                            .addComponent(jCheckBoxketqua1))
                        .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValueActionPerformed

    private void themMoiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themMoiBtnActionPerformed
        // TODO add your handling code here:
        ThemMoiXetNghiem themMoiXetNghiem = new ThemMoiXetNghiem(this.parentJFrame);
        themMoiXetNghiem.setLocationRelativeTo(null);
        themMoiXetNghiem.setResizable(false);
        themMoiXetNghiem.setVisible(true);
    }//GEN-LAST:event_themMoiBtnActionPerformed

    private void jtfsoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfsoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfsoLuongActionPerformed

    private void thongKeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongKeBtnActionPerformed
        // TODO add your handling code here:
        List<Boolean> listbool= new ArrayList<>();
        listbool.add(jCheckBox1.isSelected());
        listbool.add(jCheckBox3.isSelected());
        listbool.add(jCheckBox4.isSelected());
        List<Date> listdate= new ArrayList<>();
        listdate.add(Ngay1.getDate());
        listdate.add(Ngay2.getDate());
        List<String> listhinhthuc= new ArrayList<>();
        if(jCheckBoxhinhthuc1.isSelected())listhinhthuc.add(jCheckBoxhinhthuc1.getText());
        if(jCheckBoxhinhthuc2.isSelected())listhinhthuc.add(jCheckBoxhinhthuc2.getText());
        
        List<String> listketqua= new ArrayList<>();
        if(jCheckBoxketqua1.isSelected())listketqua.add(jCheckBoxketqua1.getText());
        if(jCheckBoxketqua2.isSelected())listketqua.add(jCheckBoxketqua2.getText());
        
        controller.thongke(listbool, listdate, listhinhthuc, listketqua);

    }//GEN-LAST:event_thongKeBtnActionPerformed

    private void jComboBoxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFieldActionPerformed
        // TODO add your handling code here:
        field=map.get((String)jComboBoxField.getSelectedItem());

    }//GEN-LAST:event_jComboBoxFieldActionPerformed

    private void timiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timiBtnActionPerformed
        // TODO add your handling code here:
        controller.timkiem(field, jTextFieldValue.getText());

    }//GEN-LAST:event_timiBtnActionPerformed

    private void jCheckBoxhinhthuc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxhinhthuc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxhinhthuc1ActionPerformed

    private void jCheckBoxhinhthuc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxhinhthuc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxhinhthuc2ActionPerformed

    private void jCheckBoxketqua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxketqua2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxketqua2ActionPerformed

    private void jCheckBoxketqua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxketqua1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxketqua1ActionPerformed

    private void resetBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtn1ActionPerformed
        // TODO add your handling code here:
        controller.reset();
    }//GEN-LAST:event_resetBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Ngay1;
    private com.toedter.calendar.JDateChooser Ngay2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBoxhinhthuc1;
    private javax.swing.JCheckBox jCheckBoxhinhthuc2;
    private javax.swing.JCheckBox jCheckBoxketqua1;
    private javax.swing.JCheckBox jCheckBoxketqua2;
    private javax.swing.JComboBox<String> jComboBoxField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldValue;
    private javax.swing.JTextField jtfsoLuong;
    private javax.swing.JButton resetBtn1;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton themMoiBtn;
    private javax.swing.JButton thongKeBtn;
    private javax.swing.JButton timiBtn;
    // End of variables declaration//GEN-END:variables
}
