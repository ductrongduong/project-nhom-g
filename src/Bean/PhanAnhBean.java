package Bean;

import java.util.ArrayList;
import java.util.List;

import models.NhanKhauModel;
import models.PhanAnhModel;
import models.ChungMinhThuModel;

public class PhanAnhBean {
    //private PhanAnhModel phanAnhModel;
    private NhanKhauModel nhanKhauModel;
    private ChungMinhThuModel chungMinhThuModel;
    private List<PhanAnhModel> listPhanAnhModels;

    public PhanAnhBean(NhanKhauModel nhanKhauModel,List<PhanAnhModel> listPhanAnhModels,ChungMinhThuModel chungMinhThuModel) {
        this.nhanKhauModel = nhanKhauModel;
        this.listPhanAnhModels=listPhanAnhModels;
        this.chungMinhThuModel=chungMinhThuModel;
    }

    public PhanAnhBean() {
        this.nhanKhauModel = new NhanKhauModel();
        this.listPhanAnhModels= new ArrayList<>();
        this.chungMinhThuModel= new ChungMinhThuModel();
    }

    public NhanKhauModel getNhanKhauModel() {
        return nhanKhauModel;
    }

    public void setNhanKhauModel(NhanKhauModel nhanKhauModel) {
        this.nhanKhauModel = nhanKhauModel;
    }

    public ChungMinhThuModel getChungMinhThuModel() {
        return chungMinhThuModel;
    }

    public void setChungMinhThuModel(ChungMinhThuModel chungMinhThuModel) {
        this.chungMinhThuModel = chungMinhThuModel;
    }

    public List<PhanAnhModel> getListPhanAnhModels() {
        return listPhanAnhModels;
    }

    public void setListPhanAnhModels(List<PhanAnhModel> listPhanAnhModels) {
        this.listPhanAnhModels = listPhanAnhModels;
    }
    
    

    
    

    @Override
    public String toString() {
        String res = "<html> <style>p {padding: 5px; margin-left: 20px} table, th, td {border: 1px solid black; border-collapse: collapse;} table {width: 500px}</style> <div>"
                + "<h3>Thông tin cơ bản"
                + "<p>Tên nhân khẩu: <b>" + nhanKhauModel.getHoTen() + "</p>"
                + "<p>Ngày sinh: <b>" + nhanKhauModel.getNamSinh()+ "</p>"
                + "<p>Số CCCD: <b>" + chungMinhThuModel.getSoCMT()+ "</p>"
                + "<p>Nơi thường trú: <b>" + nhanKhauModel.getNoiThuongTru()+ "</p>"
                + "<h4>Lịch sử phản ánh<table>"
                + "<tr>"
                + "<th>Id:</th>"                
                + "<th>Ngày phản ánh:</th>"
                + "<th>Nội dung:</th>"
                + "<th>Phân loại:</th>"
                + "<th>Trạng thái:</th>";
            
        for(PhanAnhModel phanAnhModel: listPhanAnhModels){
            res += "<tr>"
                +  "<td>"
                + phanAnhModel.getPhanAnhID()
                +  "<td>"                    
                + phanAnhModel.getNgayPhanAnh()
                +  "<td>"
                + phanAnhModel.getNoiDung()
                +  "<td>"
                + phanAnhModel.getPhanLoai()
                +  "<td>"
                + phanAnhModel.getTrangThai()
                + "</tr>"   ;
        }
        res += "</table></div></html>";
        return res;
    }

}
