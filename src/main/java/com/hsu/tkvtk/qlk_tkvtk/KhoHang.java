/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

/**
 *
 * @author Nguye
 */
public class KhoHang {

    private String idKhoHang;
    private String tenKho;
    private String diaChi;
    private int sucChua;
    private String trangThai;

    public KhoHang(String idKhoHang, String tenKho, String diaChi, int sucChua, String trangThai) {
        this.idKhoHang = idKhoHang;
        this.tenKho = tenKho;
        this.diaChi = diaChi;
        this.sucChua = sucChua;
        this.trangThai = trangThai;
    }

    public KhoHang() {
    }

    public String getIdKhoHang() {
        return idKhoHang;
    }

    public void setIdKhoHang(String idKhoHang) {
        this.idKhoHang = idKhoHang;
    }

    public String getTenKho() {
        return tenKho;
    }

    public void setTenKho(String tenKho) {
        this.tenKho = tenKho;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}
