/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lohang {
    String idLoHang;
    String idSanPham;
    int soLuong;
    String ngaySanXuat;
    String hanSuDung;

    public Lohang() {
    }

    public Lohang(String idLoHang, String idSanPham, int soLuong, String ngaySanXuat, String hanSudung) {
        this.idLoHang = idLoHang;
        this.idSanPham = idSanPham;
        this.soLuong = soLuong;
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung = hanSudung;
    }

    public String getIdLoHang() {
        return idLoHang;
    }

    public void setIdLoHang(String idLoHang) {
        this.idLoHang = idLoHang;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getHanSudung() {
        return hanSuDung;
    }

    public void setHanSudung(String hanSudung) {
        this.hanSuDung = hanSudung;
    }
    public void nhapLohang(){
        System.out.println("nhap ID lo hang:");
        Scanner sc = new Scanner(System.in);
        idLoHang = sc.nextLine();
        System.out.println("nhap Ngay San Xuat:");
        Scanner ac = new Scanner(System.in);
        ngaySanXuat = ac.nextLine();
        System.out.println("nhap han su dung:");
        Scanner bc = new Scanner(System.in);
        hanSuDung = bc.nextLine();
        System.out.println("nhap ID san pham:");
        Scanner cc = new Scanner(System.in);
        idSanPham = cc.nextLine();
        System.out.println("nhap so luong:");
        Scanner dc = new Scanner(System.in);
        soLuong = dc.nextInt();
        
    }
    public void xuatLohang(){
        System.out.println("ID lo hang:"+idLoHang+"NSX:"+ngaySanXuat+"HSD"+hanSuDung+"ID san pham"+idSanPham+"so luong:"+soLuong);
    }
    @Override
    public String toString(){
        String s= String.format("%-20s%-20s%-20d%-20s%-20s",idLoHang,idSanPham,soLuong,ngaySanXuat,hanSuDung);
        return s;
    }
    
}
