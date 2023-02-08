package controllers.PhanAnhManagerController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.PhanAnhModel;
import services.MysqlConnection;

/**
 *
 * @author Dat
 */

// lop thuc hien cac chuc nang trong giao dien them moi nhan khau

public class ThemMoiController {
    public boolean addNewPhanAnh(PhanAnhModel phanAnhModel) throws SQLException, ClassNotFoundException{
        
        Connection connection = MysqlConnection.getMysqlConnection();
        String query = "INSERT INTO "
                    + "phan_anh(nhanKhauID, ngayPhanAnh, noiDung," 
                    + "phanLoai, trangThai) "
                    + " values (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, phanAnhModel.getNhanKhauID());
        java.sql.Date ngayxn = new java.sql.Date(phanAnhModel.getNgayPhanAnh().getTime());
        preparedStatement.setDate(2, ngayxn);
        preparedStatement.setString(3, phanAnhModel.getNoiDung());
        preparedStatement.setString(4, phanAnhModel.getPhanLoai());
        preparedStatement.setString(5, phanAnhModel.getTrangThai());
     
        
        preparedStatement.executeUpdate();
            
            
        ResultSet rs = preparedStatement.getGeneratedKeys();
            
//        if (rs.next()){
//            System.out.println(rs.getString(1));
//        }
            



        
        
        preparedStatement.close();
        
        return true;
    }
}
