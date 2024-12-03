/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

/**
 *
 * @author taitu
 */
public class ThanhToan {
    private String idThanhToan;
    private String ngayThanhToan;
    private double soTien;
    private String phuongThucThanhToan;
    private String trangThai;

    public String getIdThanhToan() {
        return idThanhToan;
    }

    public void setIdThanhToan(String idThanhToan) {
        this.idThanhToan = idThanhToan;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public ThanhToan() {
    }

    public ThanhToan(String idThanhToan, String ngayThanhToan, double soTien, String phuongThucThanhToan, String trangThai) {
        this.idThanhToan = idThanhToan;
        this.ngayThanhToan = ngayThanhToan;
        this.soTien = soTien;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.trangThai = trangThai;
    }
    
    @Override
    public String toString()
    {
        return String.format("%-20s %-20s %-20f %-20s %-20s",getIdThanhToan(),getNgayThanhToan(),getSoTien(),getPhuongThucThanhToan(),getTrangThai());
    }
}
