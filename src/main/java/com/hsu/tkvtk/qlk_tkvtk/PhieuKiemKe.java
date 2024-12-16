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
         
    private String nhanVienKiemKe,ketQua,ghiChu;
    private int idPhieuKiemKe;
    private int ngayKiemKe;
     
    
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
    public int getNgayKiemKe(){
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
    public void getNgayKiemKe(int NgayKiemKe){
        this.ngayKiemKe=NgayKiemKe;
    }
    
    public PhieuKiemKe(String nhanVienKiemKe, int idPhieuKiemKe, int ngayKiemKe, String ketQua, String ghiChu){
        this.nhanVienKiemKe=nhanVienKiemKe;
        this.idPhieuKiemKe=idPhieuKiemKe;
        this.ngayKiemKe=ngayKiemKe;
        this.ketQua=ketQua;
        this.ghiChu=ghiChu;
    }
    
    public PhieuKiemKe(){
        
    }
    @Override
    public String toString(){
        return String.format("%-20s %-20d %-20d %-20s %-20s",nhanVienKiemKe,idPhieuKiemKe,ngayKiemKe,ketQua,ghiChu) ;
    }
}
