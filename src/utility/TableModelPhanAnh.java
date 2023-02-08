package utility;

import Bean.PhanAnhBean;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hai
 */
public class TableModelPhanAnh {
    
    public DefaultTableModel setTablePhanAnh(List<PhanAnhBean> listItem){
        String[] listColumn={"Nhân khẩu ID","Tên nhân khẩu","Ngày phản ánh","Nội dung",
            "Phân loại","Trạng thái"};
        DateString dateString =new DateString();
        final int columns = listColumn.length;
        DefaultTableModel dtm = new DefaultTableModel()  {
            @Override
            public boolean isCellEditable(int row, int column) {
                return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
            }
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 6 ? Boolean.class : String.class;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        Object[] obj;
        obj = new Object[columns];
        listItem.forEach((PhanAnhBean item) -> {  
            obj[0]= item.getNhanKhauModel().getID();
            obj[1]= item.getNhanKhauModel().getHoTen();
            obj[2]= dateString.dateToString(item.getListPhanAnhModels().get(0).getNgayPhanAnh());
            obj[3]= item.getListPhanAnhModels().get(0).getNoiDung();
            obj[4]= item.getListPhanAnhModels().get(0).getPhanLoai();
            obj[5]= item.getListPhanAnhModels().get(0).getTrangThai();
            
            dtm.addRow(obj);
        });
        return dtm;
    }
    

}
