package com.hsu.tkvtk.qlk_tkvtk;

public class KeHang {

    private String idKe;
    private String viTriKe;
    private String loaiKe;
    private String loaiHang;
    private String maHang;
    private int soTang;
    private int soLuong;
    private double sucChua;

    public KeHang() {
    }

    public KeHang(String idKe, String viTriKe, String loaiKe, String loaiHang, String maHang, int soTang, int soLuong, double sucChua) {
        this.idKe = idKe;
        this.viTriKe = viTriKe; // Sửa lại tên biến
        this.loaiKe = loaiKe;
        this.loaiHang = loaiHang;
        this.maHang = maHang;
        this.soTang = soTang;
        this.soLuong = soLuong;
        this.sucChua = sucChua;
    }

    public String getIdKe() {
        return idKe;
    }

    public String getViTriKe() {
        return viTriKe; // Sửa lại tên biến
    }

    public String getLoaiKe() {
        return loaiKe;
    }

    public String getLoaiHang() {
        return loaiHang;
    }

    public String getMaHang() {
        return maHang;
    }

    public int getSoTang() {
        return soTang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getSucChua() {
        return sucChua;
    }

    public void setIdKe(String idKe) {
        this.idKe = idKe;
    }

    public void setViTriKe(String viTriKe) { // Sửa lại tên biến
        this.viTriKe = viTriKe;
    }

    public void setLoaiKe(String loaiKe) {
        this.loaiKe = loaiKe;
    }

    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setSucChua(double sucChua) {
        this.sucChua = sucChua;
    }

    @Override
    public String toString() {
        return String.format(
                "%-20s %-20s %-20s %-20s %-20s %-20d %-20d %-20f",
                getIdKe(),
                getViTriKe(),
                getLoaiKe(),
                getLoaiHang(),
                getMaHang(),
                getSoTang(),
                getSoLuong(),
                getSucChua()
        );
    }

}
