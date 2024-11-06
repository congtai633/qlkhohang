/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;



/**
 *
 * @author Admin
 */
public class PhieuKiemKe {
         
    private String nhanVienKiemKe,ketQua,ghiChu,ngayKiemKe;
    private int idPhieuKiemKe;

     
    
    public String getNhanVienKiemKe(){
        return nhanVienKiemKe;
    }
    public String getKetQua(){
        return ketQua;
    }
    public String getGhiChu(){
        return ghiChu;
    }
    public int getIdPhieuKiemKe(){
        return idPhieuKiemKe;
    }
    public String getNgayKiemKe(){
        return ngayKiemKe;
    }
    
     public void setNhanVienKiemKe(String NhanVienKiemKe){
        this.nhanVienKiemKe=NhanVienKiemKe;
    }
    public void setKetQua(String KetQua){
        this.ketQua=KetQua;
    }
    public void setGhiChu(String GhiChu){
        this.ghiChu=GhiChu;
    }
    public void setIdPhieuKiemKe(int IdPhieuKiemKe){
        this.idPhieuKiemKe=IdPhieuKiemKe;
    }
    public void getNgayKiemKe(String NgayKiemKe){
        this.ngayKiemKe=NgayKiemKe;
    }
    
    public PhieuKiemKe(String nhanVienKiemKe, int idPhieuKiemKe, String ngayKiemKe, String ketQua, String ghiChu){
        this.nhanVienKiemKe=nhanVienKiemKe;
        this.idPhieuKiemKe=idPhieuKiemKe;
        this.ngayKiemKe=ngayKiemKe;
        this.ketQua=ketQua;
        this.ghiChu=ghiChu;
    }
    
    public PhieuKiemKe(){
        
    }
}
