package com.hsu.tkvtk.qlk_tkvtk;

public class PhieuNhap {

    private String idPhieuNhap;
    private String ngayNhap;
    private String idNhaCC;
    private String trangThai;
    private double tongTien;

    public PhieuNhap() {
    }

    public PhieuNhap(String idPhieuNhap, String ngayNhap, String idNhaCC, String trangThai, double tongTien) {
        this.idPhieuNhap = idPhieuNhap;
        this.ngayNhap = ngayNhap;
        this.idNhaCC = idNhaCC;
        this.trangThai = trangThai;
        this.tongTien = tongTien;
    }

    public void setIdPhieuNhap(String idPhieuNhap) {
        this.idPhieuNhap = idPhieuNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setIdNhaCC(String idNhaCC) {
        this.idNhaCC = idNhaCC;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getIdPhieuNhap() {
        return idPhieuNhap;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public String getIdNhaCC() {
        return idNhaCC;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public double getTongTien() {
        return tongTien;
    }

    @Override
    public String toString() {
        return String.format(
            "%-20s %-20s %-20s %-20s %-20f",
            getIdPhieuNhap(),
            getNgayNhap(),
            getIdNhaCC(),
            getTrangThai(),
            getTongTien()
        );
    }
}
