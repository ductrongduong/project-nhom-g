package controllers.PhanAnhManagerController;

import controllers.LoginController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
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
    
    public PhanAnhModel getPhanAnhById(int phanAnhID) {
        try {
            PhanAnhModel phanAnhModel;
            Connection connection = MysqlConnection.getMysqlConnection();
            System.out.print("iddddddddddddd : " + phanAnhID);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT nhanKhauID,ngayPhanAnh,noiDung,phanLoai,trangThai FROM phan_anh WHERE phanAnhID = '" + phanAnhID +"'");
            if (rs == null) {
                return null;
            }
            while (rs.next()) {                
                int nhanKhauID = rs.getInt("nhanKhauID");
                Date ngayPhanAnh = rs.getDate("ngayPhanAnh");
                String noiDung = rs.getString("noiDung");
                String phanLoai = rs.getString("phanLoai");
                String trangThai = rs.getString("trangThai");
                phanAnhModel = new PhanAnhModel(phanAnhID, nhanKhauID, ngayPhanAnh, noiDung, phanLoai, trangThai);
                return phanAnhModel;
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean changeStatusPhanAnh(PhanAnhModel phanAnhModel) {
        if (phanAnhModel == null) {
            return false;
        }
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            Statement st = connection.createStatement();
    //        UPDATE `phan_anh` SET `noiDung` = 'Chưa đổ rácccc' WHERE `phan_anh`.`phanAnhID` = 1;
            String query = "UPDATE phan_anh SET nhanKhauID = ?, ngayPhanAnh = ?, noiDung = ?, phanLoai = ?, trangThai = ? WHERE phan_anh.phanAnhID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, phanAnhModel.getNhanKhauID());
            java.sql.Date ngayxn = new java.sql.Date(phanAnhModel.getNgayPhanAnh().getTime());
            preparedStatement.setDate(2, ngayxn);
            preparedStatement.setString(3, phanAnhModel.getNoiDung());
            preparedStatement.setString(4, phanAnhModel.getPhanLoai());
            preparedStatement.setString(5, phanAnhModel.getTrangThai());
            preparedStatement.setInt(6, phanAnhModel.getPhanAnhID());
            preparedStatement.executeUpdate();

            ResultSet rs = preparedStatement.getGeneratedKeys();
            preparedStatement.close();
            return true;                
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

        
    }
}
