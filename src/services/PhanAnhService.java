package services;

import Bean.PhanAnhBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import models.PhanAnhModel;
import models.ChungMinhThuModel;
import models.NhanKhauModel;
import utility.DateString;

public class PhanAnhService {
    // them moi nguoi phan anh
    public PhanAnhBean getPhanAnh(int nhanKhauID){
        PhanAnhBean phanAnhBean= new PhanAnhBean();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT nk.hoTen,nk.namSinh,nk.noiThuongTru,nk.gioiTinh,\n" +
                           "cmt.ID cmtID,cmt.soCMT,cmt.ngayCap,cmt.noiCap\n" +
                           "FROM nhan_khau nk JOIN chung_minh_thu cmt ON cmt.idNhanKhau=nk.ID\n"+
                           "WHERE nk.ID = '"+String.valueOf(nhanKhauID)
                           + "';"
                    ;
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                NhanKhauModel nhanKhau = phanAnhBean.getNhanKhauModel();
                nhanKhau.setID(nhanKhauID);
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = phanAnhBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(nhanKhauID);
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));

            }
            preparedStatement.close();
            query = "SELECT phanAnhID,nhanKhauID,ngayPhanAnh,noiDung,"
                + "phanLoai,trangThai \n" +
                "FROM phan_anh\n" +
                "WHERE nhanKhauID= " +String.valueOf(nhanKhauID)+
                ";";
            preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                PhanAnhModel phanAnhModel= new PhanAnhModel();
                phanAnhModel.setPhanAnhID(rs.getInt("phanAnhID"));
                phanAnhModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                phanAnhModel.setNgayPhanAnh(rs.getDate("ngayPhanAnh"));
                phanAnhModel.setNoiDung(rs.getString("noiDung"));
                phanAnhModel.setPhanLoai(rs.getString("phanLoai"));
                phanAnhModel.setTrangThai(rs.getString("trangThai"));
                
                phanAnhBean.getListPhanAnhModels().add(phanAnhModel);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return phanAnhBean;
    }
    
    public List<PhanAnhBean> getListPhanAnh(){
        List<PhanAnhBean> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT xn.phanAnhID,xn.nhanKhauID,xn.ngayPhanAnh, xn.noiDung,  "
                    + "xn.phanLoai, xn.trangThai,nk.hoTen,nk.namSinh,"
                    + "nk.noiThuongTru,nk.gioiTinh, cmt.ID cmtID, "
                    + "cmt.soCMT,cmt.ngayCap,cmt.noiCap \n" 
                    + "FROM phan_anh xn JOIN nhan_khau nk ON xn.nhanKhauID=nk.ID \n" 
                    + "JOIN chung_minh_thu cmt ON nk.ID= cmt.idNhanKhau \n" 
                    + "JOIN (SELECT phanAnhID, ngayPhanAnh FROM phan_anh GROUP BY nhanKhauID) maxxn ON xn.phanAnhID=maxxn.phanAnhID\n" 
                    +";";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                PhanAnhBean phanAnhBean =new PhanAnhBean();
                PhanAnhModel phanAnhModel= new PhanAnhModel();
                phanAnhModel.setPhanAnhID(rs.getInt("phanAnhID"));
                phanAnhModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                phanAnhModel.setNgayPhanAnh(rs.getDate("ngayPhanAnh"));
                phanAnhModel.setNoiDung(rs.getString("noiDung"));
                phanAnhModel.setPhanLoai(rs.getString("phanLoai"));
                phanAnhModel.setTrangThai(rs.getString("trangThai"));
                
                phanAnhBean.getListPhanAnhModels().add(phanAnhModel);
                
                NhanKhauModel nhanKhau = phanAnhBean.getNhanKhauModel();
                nhanKhau.setID(rs.getInt("nhanKhauID"));
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = phanAnhBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(rs.getInt("nhanKhauID"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));
                list.add(phanAnhBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Loi tai dong 135 PhanAnh Service");
        }
        return list;
    }
    
    public List<PhanAnhBean> findListPhanAnh(String field,String value){
        List<PhanAnhBean> list = new ArrayList<>();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT xn.phanAnhID,xn.nhanKhauID,xn.ngayPhanAnh, xn.noiDung, "
                    + "xn.phanLoai, xn.trangThai,nk.hoTen,nk.namSinh,"
                    + "nk.noiThuongTru,nk.gioiTinh, cmt.ID cmtID, "
                    + "cmt.soCMT,cmt.ngayCap,cmt.noiCap \n" 
                    + "FROM phan_anh xn JOIN nhan_khau nk ON xn.nhanKhauID=nk.ID \n" 
                    + "JOIN chung_minh_thu cmt ON nk.ID= cmt.idNhanKhau \n" 
                    + "JOIN (SELECT phanAnhID, max(ngayPhanAnh) FROM phan_anh GROUP BY nhanKhauID) maxxn ON xn.phanAnhID=maxxn.phanAnhID\n" 
                    + "WHERE "+field +" LIKE '%"+value+"%' "
                    +"\n;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                PhanAnhBean phanAnhBean =new PhanAnhBean();
                PhanAnhModel phanAnhModel= new PhanAnhModel();
                phanAnhModel.setPhanAnhID(rs.getInt("phanAnhID"));
                phanAnhModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                phanAnhModel.setNgayPhanAnh(rs.getDate("ngayPhanAnh"));
                phanAnhModel.setNoiDung(rs.getString("noiDung"));
                phanAnhModel.setPhanLoai(rs.getString("phanLoai"));
                phanAnhModel.setTrangThai(rs.getString("trangThai"));
                phanAnhBean.getListPhanAnhModels().add(phanAnhModel);
                
                NhanKhauModel nhanKhau = phanAnhBean.getNhanKhauModel();
                nhanKhau.setID(rs.getInt("nhanKhauID"));
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = phanAnhBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(rs.getInt("nhanKhauID"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));
                
                list.add(phanAnhBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Loi tai dong 187 PhanAnh Service");
        }
        return list;
        
    }
    
    
    public List<PhanAnhBean> thongKeListPhanAnh(List<Boolean> boolCheckbox, List<Date> date,List<String> phanloai,List<String> trangthai){
        List<PhanAnhBean> list = new ArrayList<>();
        
        Calendar calendar = Calendar.getInstance();
        
        DateString dateString =new DateString();
        try {
            Connection connection = MysqlConnection.getMysqlConnection();
            String query = "SELECT xn.phanAnhID,xn.nhanKhauID,xn.ngayPhanAnh, xn.noiDung, "
                    + "xn.phanLoai, xn.trangThai,nk.hoTen,nk.namSinh,"
                    + "nk.noiThuongTru,nk.gioiTinh, cmt.ID cmtID, "
                    + "cmt.soCMT,cmt.ngayCap,cmt.noiCap \n" 
                    + "FROM phan_anh xn JOIN nhan_khau nk ON xn.nhanKhauID=nk.ID \n" 
                    + "JOIN chung_minh_thu cmt ON nk.ID= cmt.idNhanKhau \n" 
                    + "JOIN (SELECT phanAnhID, max(ngayPhanAnh) FROM phan_anh GROUP BY nhanKhauID) maxxn ON xn.phanAnhID=maxxn.phanAnhID\n"
                    ;
            List<String> liststr=new ArrayList<String>();
            if(boolCheckbox.get(0)){
                String str="( ngayPhanAnh >= '";
                calendar.setTime(date.get(0));
                str+= String.valueOf(calendar.get(Calendar.YEAR))+"-"+
                      String.valueOf(calendar.get(Calendar.MONTH)+1)+"-"+
                      String.valueOf(calendar.get(Calendar.DATE));
                str+="' AND ngayPhanAnh <= '";
                calendar.setTime(date.get(1));
                str+= String.valueOf(calendar.get(Calendar.YEAR))+"-"+
                      String.valueOf(calendar.get(Calendar.MONTH)+1)+"-"+
                      String.valueOf(calendar.get(Calendar.DATE));
                str+="' )";
                liststr.add(str);
            }

            if(boolCheckbox.get(1)&& !phanloai.isEmpty()){
                String str="( phanLoai IN (";
                str+=" '"+phanloai.get(0) +"' ";
                for(int i=1;i<phanloai.size();i++)str+=", '"+phanloai.get(i)+"' ";
                str+=") )";
                liststr.add(str);
            }
            if(boolCheckbox.get(2)&& !trangthai.isEmpty()){
                for(int i=0;i<trangthai.size();i++){
                    if(trangthai.get(i).equalsIgnoreCase("khác"))
                        trangthai.set(i, "( trangThai NOT LIKE '%Mới ghi nhận%' AND  trangThai NOT LIKE '%Chưa giải quyết%'  AND  trangThai NOT LIKE '%Đã giải quyết%')");
                    else 
                        trangthai.set(i,"( trangThai LIKE '%"+trangthai.get(i)+ "%' )");
                }
                liststr.add("( "+String.join(" OR ", trangthai)+" )" );
                
            }
            if(!liststr.isEmpty())query=query+"WHERE "+ String.join(" AND ",liststr );
            query+="\n;";
            PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                PhanAnhBean phanAnhBean =new PhanAnhBean();
                PhanAnhModel phanAnhModel= new PhanAnhModel();
                phanAnhModel.setPhanAnhID(rs.getInt("phanAnhID"));
                phanAnhModel.setNhanKhauID(rs.getInt("nhanKhauID"));
                phanAnhModel.setNgayPhanAnh(rs.getDate("ngayPhanAnh"));
                phanAnhModel.setNoiDung(rs.getString("noiDung"));;
                phanAnhModel.setPhanLoai(rs.getString("phanLoai"));
                phanAnhModel.setTrangThai(rs.getString("trangThai"));
                phanAnhBean.getListPhanAnhModels().add(phanAnhModel);
                
                NhanKhauModel nhanKhau = phanAnhBean.getNhanKhauModel();
                nhanKhau.setID(rs.getInt("nhanKhauID"));
                nhanKhau.setHoTen(rs.getString("hoTen"));
                nhanKhau.setGioiTinh(rs.getString("gioiTinh"));
                nhanKhau.setNamSinh(rs.getDate("namSinh"));
                nhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                ChungMinhThuModel chungMinhThuModel = phanAnhBean.getChungMinhThuModel();
                chungMinhThuModel.setID(rs.getInt("cmtID"));
                chungMinhThuModel.setIdNhanKhau(rs.getInt("nhanKhauID"));
                chungMinhThuModel.setSoCMT(rs.getString("soCMT"));
                chungMinhThuModel.setNgayCap(rs.getDate("ngayCap"));
                chungMinhThuModel.setNoiCap(rs.getString("noiCap"));
                
                list.add(phanAnhBean);
            }
            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return list;
    }
        
    /*
     * Ham sử lý ngoại lệ : thông báo ra lỗi nhận được
     */
    private void exceptionHandle(String message) {
        JOptionPane.showMessageDialog(null, message, "Warning", JOptionPane.ERROR_MESSAGE);
    }
}
