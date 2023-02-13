package models;

import java.util.Date;
/**
 *
 * @author Dat
 */
public class PhanAnhModel {

    private int phanAnhID;
    private int nhanKhauID;
    private Date ngayPhanAnh;
    private String noiDung;
    private String phanLoai;
    private String trangThai;
   
    public PhanAnhModel() {
        phanAnhID = 0;
        nhanKhauID = 0;
        ngayPhanAnh = new Date();
        noiDung = "";
        phanLoai = "";
        trangThai = "";
    }
    
    public PhanAnhModel(int phanAnhId, int nhanKhauID, Date ngayPhanAnh, 
        String noiDung, String phanLoai, String trangThai) {
        this.phanAnhID = phanAnhId;
        this.nhanKhauID = nhanKhauID;
        this.ngayPhanAnh = ngayPhanAnh;
        this.noiDung = noiDung;
        this.phanLoai = phanLoai;
        this.trangThai = trangThai;
    }

    public int getPhanAnhID() {
        return phanAnhID;
    }

    public void setPhanAnhID(int phanAnhID) {
        this.phanAnhID = phanAnhID;
    }

    public int getNhanKhauID() {
        return nhanKhauID;
    }

    public void setNhanKhauID(int nhanKhauID) {
        this.nhanKhauID = nhanKhauID;
    }

    public Date getNgayPhanAnh() {
        return ngayPhanAnh;
    }

    public void setNgayPhanAnh(Date ngayPhanAnh) {
        this.ngayPhanAnh = ngayPhanAnh;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getPhanLoai() {
        return phanLoai;
    }

    public void setPhanLoai(String phanLoai) {
        this.phanLoai = phanLoai;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}
