/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

/**
 *
 * @author taitu
 */
public class ChinhSachGiaoHang {
    private int idChinhSach;              
    private String tenChinhSach;          
    private int thoiGianGiaoHangToiDa;    
    private String donViThoiGian;         
    private double phiGiaoHang; 

    public int getIdChinhSach() {
        return idChinhSach;
    }

    public void setIdChinhSach(int idChinhSach) {
        this.idChinhSach = idChinhSach;
    }

    public String getTenChinhSach() {
        return tenChinhSach;
    }

    public void setTenChinhSach(String tenChinhSach) {
        this.tenChinhSach = tenChinhSach;
    }

    public int getThoiGianGiaoHangToiDa() {
        return thoiGianGiaoHangToiDa;
    }

    public void setThoiGianGiaoHangToiDa(int thoiGianGiaoHangToiDa) {
        this.thoiGianGiaoHangToiDa = thoiGianGiaoHangToiDa;
    }

    public String getDonViThoiGian() {
        return donViThoiGian;
    }

    public void setDonViThoiGian(String donViThoiGian) {
        this.donViThoiGian = donViThoiGian;
    }

    public double getPhiGiaoHang() {
        return phiGiaoHang;
    }

    public void setPhiGiaoHang(double phiGiaoHang) {
        this.phiGiaoHang = phiGiaoHang;
    }

    public ChinhSachGiaoHang(int idChinhSach, String tenChinhSach, int thoiGianGiaoHangToiDa, String donViThoiGian, double phiGiaoHang) {
        this.idChinhSach = idChinhSach;
        this.tenChinhSach = tenChinhSach;
        this.thoiGianGiaoHangToiDa = thoiGianGiaoHangToiDa;
        this.donViThoiGian = donViThoiGian;
        this.phiGiaoHang = phiGiaoHang;
    }

    public ChinhSachGiaoHang() {
    }
    @Override
    public String toString()
    {
        return String.format("%-20d %-20s %-20d %-20s %-20f", getIdChinhSach(),getTenChinhSach(),getThoiGianGiaoHangToiDa(),getDonViThoiGian(),getPhiGiaoHang() );
    }
}
