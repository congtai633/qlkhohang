/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;


/**
 *
 * @author CYBER
 */
public class NhaCC {
    private String idNhaCC;
    private String tenNhaCC;
    private String diaChi;
    private String soDienThoai;
    private String email;
    private String nguoiLienHe;
    private String loaiHangHoa; 
    //method
    public String getIdNhaCC()
    {
        return idNhaCC;
    }
    public String getTenNhaCC()
    {
        return tenNhaCC;
    }
    public String getDiaChi()
    {
        return diaChi;
    }
    public String getSoDienThoai()
    {
        return soDienThoai;
    }
    public String getEmail()
    {
        return email;
    }
    public String getNguoiLienHe()
    {
        return nguoiLienHe;
    }
    public String getLoaiHangHoa()
    {
        return loaiHangHoa;
    }
    public void setIdNhaCC(String idNhaCC)
    {
        this.idNhaCC=idNhaCC;
    }
    public void setTenNhaCC(String tenNhaCC)
    {
        this.tenNhaCC=tenNhaCC;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi=diaChi;
    }
    public void setSoDienThoai(String soDienThoai)
    {
        this.soDienThoai=soDienThoai;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setNguoiLienHe(String nguoiLienHe)
    {
        this.nguoiLienHe=nguoiLienHe;
    }
    public void setLoaiHangHoa(String  loaiHangHoa)
    {
        this.loaiHangHoa=loaiHangHoa;
    }
    // Constructor
      public NhaCC(){
        
    }
    public NhaCC(String idNhaCC, String tenNhaCC, String diaChi, String soDienThoai,
                 String email, String nguoiLienHe,
                 String loaiHangHoa) {
        this.idNhaCC = idNhaCC;
        this.tenNhaCC = tenNhaCC;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.nguoiLienHe = nguoiLienHe;
        this.loaiHangHoa = loaiHangHoa;
    }
    @Override
    public String toString()
    {
        return String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s",getIdNhaCC(),getTenNhaCC(),getDiaChi(),getSoDienThoai(),getEmail(),getNguoiLienHe(),getLoaiHangHoa());
    }
}
