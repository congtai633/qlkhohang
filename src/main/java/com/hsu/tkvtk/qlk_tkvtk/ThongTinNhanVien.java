/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

/**
 *
 * @author Admin
 */
public class ThongTinNhanVien {

    private String tenNH, tenNv, chucVu, addr, gioiTinh, sDt, sTk;
    private int mSnv, namSinh, soNgayCong;
    private float tongLuong, mucLuong;

    public String getTenVn() {
        return tenNv;
    }

    public String getTenNH() {
        return tenNH;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getAddr() {
        return addr;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public int getMSnv() {
        return mSnv;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getSDt() {
        return sDt;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public float getTongLuong() {
        return tongLuong;
    }

    public String getSTk() {
        return sTk;
    }

    public float getMucLuong() {
        return mucLuong;
    }

    public void setTenVn(String TenNv) {
        this.tenNv = TenNv;
    }

    public void setTenNH(String TenNH) {
        this.tenNH = TenNH;
    }

    public void setChucVu(String ChucVu) {
        this.chucVu = ChucVu;
    }

    public void setAddr(String Addr) {
        this.addr = Addr;
    }

    public void setGioiTinh(String GioiTinh) {
        this.gioiTinh = GioiTinh;
    }

    public void setMSnv(int MSnv) {
        this.mSnv = MSnv;
    }

    public void setNamSinh(int NamSinh) {
        this.namSinh = NamSinh;
    }

    public void setSDt(String SDt) {
        this.sDt = SDt;
    }

    public void setSoNgayCong(int SoNgayCong) {
        this.soNgayCong = SoNgayCong;
    }

    public void setTongLuong(float TongLuong) {
        this.tongLuong = TongLuong;
    }

    public void setSTk(String STk) {
        this.sTk = STk;
    }

    public void setMucLuong(float MucLuong) {
        this.mucLuong = MucLuong;
    }

    public ThongTinNhanVien() {

    }

    public ThongTinNhanVien(int mSnv, String tenNv, String chucVu, int namSinh, String gioiTinh, String sDt, String addr, String tenNH, String sTk, int soNgayCong, float mucLuong, float tongLuong) {
        this.mSnv = mSnv;
        this.tenNv = tenNv;
        this.chucVu = chucVu;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.sDt = sDt;
        this.addr = addr;

        this.tenNH = tenNH;
        this.sTk = sTk;
        this.tongLuong = tongLuong;

        this.soNgayCong = soNgayCong;
        this.mucLuong = mucLuong;
    }

    public void xuat() {
        System.out.println("ma so nhan vien" + mSnv + "/" + "ten nhan vien" + tenNv + "/" + "chuc vu " + chucVu + "/" + "nam sinh" + namSinh + "/" + "gioiTinh" + gioiTinh + "/" + "so dien thoai" + sDt + "/" + "dia chi luu tru" + addr + "/" + "ten ngan hang" + tenNH + "/" + "STK" + sTk + "/" + "so ngay cong" + soNgayCong + "/" + "muc luong" + mucLuong + "/" + "tong luong" + tongLuong);
    }

    public void tongLuong() {
        tongLuong = soNgayCong * mucLuong;
    }

}
