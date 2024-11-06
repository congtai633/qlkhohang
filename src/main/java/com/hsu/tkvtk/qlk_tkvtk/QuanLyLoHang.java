/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLyLoHang {

    private ArrayList<Lohang> dsLh = new ArrayList();

    public void themLohang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ID lo hang:");
        String idLH = sc.nextLine();
        System.out.println("nhap Ngay San Xuat:");
        String nsx = sc.nextLine();
        System.out.println("nhap han su dung:");
        String hsd = sc.nextLine();
        System.out.println("nhap ID san pham:");
        String idSP = sc.nextLine();
        System.out.println("nhap so luong:");
        int soluong =sc.nextInt();
        Lohang Lh = new Lohang(idLH,idSP,soluong,nsx,hsd);
        dsLh.add(Lh);
        System.out.println("Them lo hang thanh cong !");
    }

    public void xoaLh() {

    }

    public void capnhatLh() {

    }

    public void xemLh() {
        System.out.format("%-20s%-20s%-20s%-20s%-20s\n", "Lh.idLoHang","Lh.idSanPham","Lh.soLuong" ,"Lh.ngaySanXuat", "Lh.hanSuDung");
        for (Lohang Lh : dsLh) {
            System.out.format("%-20s%-20s%-20d%-20s%-20s\n", Lh.getIdLoHang(),Lh.getIdSanPham(),Lh.getSoLuong(),Lh.getNgaySanXuat(),Lh.getHanSudung());
        }
    }
}
