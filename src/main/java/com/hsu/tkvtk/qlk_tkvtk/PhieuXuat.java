package com.hsu.tkvtk.qlk_tkvtk;

public class PhieuXuat {
    private String idPhieuXuat;
    private String ngayXuat;
    private String idKhachHang;
    private double tongTien;
    private String trangThai;

    public PhieuXuat() {
    }

    public PhieuXuat(String idPhieuXuat, String ngayXuat, String idKhachHang, double tongTien, String trangThai) {
        this.idPhieuXuat = idPhieuXuat;
        this.ngayXuat = ngayXuat;
        this.idKhachHang = idKhachHang;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public void setIdPhieuXuat(String idPhieuXuat) {
        this.idPhieuXuat = idPhieuXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getIdPhieuXuat() {
        return idPhieuXuat;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public double getTongTien() {
        return tongTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    @Override
    public String toString() {
        return String.format(
            "%-20s %-20s %-20s %-20f %-20s",
            getIdPhieuXuat(),
            getNgayXuat(),
            getIdKhachHang(),
            getTongTien(),
            getTrangThai()
        );
    }
}

