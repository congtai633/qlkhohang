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
public class SanPham {

    private String idSp;
    private String tenSp;
    private float giaSp;
    private int soLuong;

    public SanPham() {
    }

    public SanPham(String idSp, String tenSp, float giaSp, int soLuong) {
        this.idSp = idSp;
        this.tenSp = tenSp;
        this.giaSp = giaSp;
        this.soLuong = soLuong;
    }

    public String getIdSp() {
        return idSp;
    }

    public void setIdSp(String maSp) {
        this.idSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public float getGiaSp() {
        return giaSp;
    }

    public void setGiaSp(float giaSp) {
        this.giaSp = giaSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void nhaphang() {
        System.out.println("nhap ten hang:");
        Scanner nhapten = new Scanner(System.in);
        tenSp = nhapten.nextLine();
        System.out.println("nhap ma hang:");
        Scanner nhapma = new Scanner(System.in);
        idSp = nhapma.nextLine();

        System.out.println("nhap gia hang:");
        Scanner nhapgia = new Scanner(System.in);
        giaSp = nhapgia.nextFloat();
        System.out.println("nhap so luong :");
        Scanner sl = new Scanner(System.in);
        soLuong = sl.nextInt();

    }

    public void xuathang() {
        System.out.println("ten hang hoa: " + tenSp + "\n ma hang hoa: " + idSp + "\n giaHH " + giaSp + "so luong:" + soLuong);

    }
}
