package controllers;

import Bean.PhanAnhBean;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.EventObject;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import services.PhanAnhService;
import utility.TableModelPhanAnh;
import views.infoViews.InfoJframe;

/**
 *
 * @author Hoang
 */
public class PhanAnhPanelController {
    private JPanel jpnView;
    private JTextField jtfsoLuong;
    private PhanAnhService phanAnhService;
    private List<PhanAnhBean> listPhanAnhBeans;
    private TableModelPhanAnh tableModelPhanAnh;
    private JFrame parentJFrame;
    
    public PhanAnhPanelController(JPanel jpnView, JTextField jtfSoLuong){
        this.jpnView = jpnView;
        this.jtfsoLuong = jtfSoLuong;
        tableModelPhanAnh = new TableModelPhanAnh();
        this.phanAnhService = new PhanAnhService();
        this.listPhanAnhBeans = this.phanAnhService.getListPhanAnh();
        setSoLuong();
        setDataTable();

    }

    public PhanAnhPanelController() {
    }
    public void setSoLuong(){
        this.jtfsoLuong.setText("" + listPhanAnhBeans.size());
    }
    
    public void setDataTable(){
        DefaultTableModel model = tableModelPhanAnh.setTablePhanAnh(listPhanAnhBeans);
        JTable table = new JTable(model){
            @Override
            public boolean editCellAt(int row, int column, EventObject e) {
                return false;
            }
            
        };
        
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(40);
        table.validate();
        table.repaint();
        table.setFont(new Font("Arial", Font.PLAIN, 14));
//        table.getColumnModel().getColumn(0).setMaxWidth(80);
//        table.getColumnModel().getColumn(0).setMinWidth(80);
//        table.getColumnModel().getColumn(0).setPreferredWidth(80);
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                JOptionPane.showConfirmDialog(null, table.getSelectedRow());
//                System.out.println(table.getSelectedRow());
                if (e.getClickCount() > 1) {
//                    System.out.println(table.getSelectedRow());
                    System.out.println("11111111111111111");
                    chiTiet(table.getSelectedRow());
                }
                
            }
            
        });
        
        
        JScrollPane scroll = new JScrollPane();
        scroll.getViewport().add(table);
        scroll.setPreferredSize(new Dimension(1300, 290));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scroll);
        jpnView.validate();
        jpnView.repaint();
        
    }
    
    public void thongke(List<Boolean> boolCheckbox, List<Date> date,List<String> hinhthuc,List<String> ketqua){
        this.listPhanAnhBeans = this.phanAnhService.thongKeListPhanAnh(boolCheckbox, date, hinhthuc, ketqua);
        setSoLuong();
        setDataTable();        
    }
    
    public void chiTiet(int i){
        PhanAnhBean temp = listPhanAnhBeans.get(i);
        PhanAnhBean info = phanAnhService.getPhanAnh(temp.getNhanKhauModel().getID());
        InfoJframe infoJframe = new InfoJframe(info.toString(), parentJFrame);
        infoJframe.setLocationRelativeTo(null);
        infoJframe.setVisible(true);
    }
    public void timkiem(String field,String value){
        this.listPhanAnhBeans = this.phanAnhService.findListPhanAnh(field, value);
        setSoLuong();
        setDataTable();
    }
    
    public void reset(){
        this.listPhanAnhBeans = this.phanAnhService.getListPhanAnh();
        setSoLuong();
        setDataTable();
    }
    
    public JPanel getJpnView() {
        return jpnView;
    }

    public void setJpnView(JPanel jpnView) {
        this.jpnView = jpnView;
    }

    public JTextField getJtfsoLuong() {
        return jtfsoLuong;
    }

    public void setJtfsoLuong(JTextField jtfsoLuong) {
        this.jtfsoLuong = jtfsoLuong;
    }

    public PhanAnhService getPhanAnhService() {
        return phanAnhService;
    }

    public void setCachLyService(PhanAnhService phanAnhService) {
        this.phanAnhService = phanAnhService;
    }

    public List<PhanAnhBean> getListPhanAnhBeans() {
        return listPhanAnhBeans;
    }

    public void setListPhanAnhBeans(List<PhanAnhBean> listPhanAnhBeans) {
        this.listPhanAnhBeans = listPhanAnhBeans;
    }

    public TableModelPhanAnh getTableModelPhanAnh() {
        return tableModelPhanAnh;
    }

    public void setTableModelPhanAnh(TableModelPhanAnh tableModelPhanAnh) {
        this.tableModelPhanAnh = tableModelPhanAnh;
    }

    public JFrame getParentJFrame() {
        return parentJFrame;
    }

    public void setParentJFrame(JFrame parentJFrame) {
        this.parentJFrame = parentJFrame;
    }
    
}
