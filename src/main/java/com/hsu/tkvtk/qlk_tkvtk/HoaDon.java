/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

/**
 *
 * @author Nguye
 */
public class HoaDon {

    private String tenDoanhNghiep;
    private String diaChiDoanhNghiep;
    private String maSoThue;
    private String sDT;
    private String tenKhachHang, diaChiKhachHang, maSoThueKhachHang, sDTKhachHang;
    private String tenSanPham, maSanPham;
    private int donViTinh, soLuong, donGia;
    private float thanhTien;

    public void setTenDoanhNghiep(String tenDoanhNghiep) {
        this.tenDoanhNghiep = tenDoanhNghiep;
    }

    public void setDiaChiDoanhNghiep(String diaChiDoanhNghiep) {
        this.diaChiDoanhNghiep = diaChiDoanhNghiep;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setDiaChiKhachHang(String diaChiKhachHang) {
        this.diaChiKhachHang = diaChiKhachHang;
    }

    public void setMaSoThueKhachHang(String maSoThueKhachHang) {
        this.maSoThueKhachHang = maSoThueKhachHang;
    }

    public void setsDTKhachHang(String sDTKhachHang) {
        this.sDTKhachHang = sDTKhachHang;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public void setDonViTinh(int donViTinh) {
        this.donViTinh = donViTinh;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getTenDoanhNghiep() {
        return tenDoanhNghiep;
    }

    public String getDiaChiDoanhNghiep() {
        return diaChiDoanhNghiep;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public String getsDT() {
        return sDT;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getDiaChiKhachHang() {
        return diaChiKhachHang;
    }

    public String getMaSoThueKhachHang() {
        return maSoThueKhachHang;
    }

    public String getsDTKhachHang() {
        return sDTKhachHang;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public int getDonViTinh() {
        return donViTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public HoaDon(String tenDoanhNghiep, String diaChiDoanhNghiep, String maSoThue, String sDT, String tenKhachHang, String diaChiKhachHang, String maSoThueKhachHang, String sDTKhachHang, String tenSanPham, String maSanPham, int donViTinh, int soLuong, int donGia, float thanhTien) {
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.diaChiDoanhNghiep = diaChiDoanhNghiep;
        this.maSoThue = maSoThue;
        this.sDT = sDT;
        this.tenKhachHang = tenKhachHang;
        this.diaChiKhachHang = diaChiKhachHang;
        this.maSoThueKhachHang = maSoThueKhachHang;
        this.sDTKhachHang = sDTKhachHang;
        this.tenSanPham = tenSanPham;
        this.maSanPham = maSanPham;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;

    }

    public HoaDon() {

    }

    @Override
    public String toString() {
        return String.format("%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30d%-30d%-30d%-30f\n", getTenDoanhNghiep(), getDiaChiDoanhNghiep(), getMaSoThue(), getsDT(), getTenKhachHang(), getDiaChiKhachHang(), getMaSoThueKhachHang(), getsDTKhachHang(), getTenSanPham(), getMaSanPham(), getDonViTinh(), getSoLuong(), getDonGia(), getThanhTien());
    }

}
