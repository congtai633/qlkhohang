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
public class QuanLyNV {

    private ArrayList<ThongTinNhanVien> danhSachNV = new ArrayList<ThongTinNhanVien>();

    public void themNV() {

        Scanner sc = new Scanner(System.in);

        System.out.println("NHAP TEN NHAN VIEN");
        String tenNv = sc.nextLine();
        System.out.println("NHAP TEN NGAN HANG");
        String tenNH = sc.nextLine();
        System.out.println("NHAP CHUC VU");
        String chucVu = sc.nextLine();
        System.out.println("NHAP DIA CHI");
        String addr = sc.nextLine();
        System.out.println("SO DIEN THOAI");
        String sDt = sc.nextLine();
        System.out.println("SO TAI KHOAN NGAN HANG");
        String sTk = sc.nextLine();
        System.out.println("GIOI TINH");
        String gioiTinh = sc.nextLine();
        System.out.println("MA SO NHAN VIEN");
        int mSnv = sc.nextInt();
        System.out.println("NAM SINH");
        int namSinh = sc.nextInt();

        System.out.println("LUONG THANG");
        float tongLuong = sc.nextFloat();

        System.out.println("MUC LUONG");
        float mucLuong = sc.nextFloat();
        System.out.println("SO NGAY CONG");
        int soNgayCong = sc.nextInt();

        ThongTinNhanVien nv = new ThongTinNhanVien(mSnv, tenNv, chucVu, namSinh, gioiTinh, sDt, addr, tenNH, sTk, soNgayCong, mucLuong, tongLuong);
        danhSachNV.add(nv);
        System.out.println("THEM NHAN VIEN THANH CONG");
    }

    public void capNhatNV() {

    }

    public void xoaNV() {

    }

    public void xemDanhSachNV() {
        System.out.format("%-20s %-20s %-40s %-20s %-30s %-20s %-20s %-20s %-20s %-20s %-20s %-20s \n",
                 "ma so nhan vien", "ten nhan vien", "chuc vu", "nam sinh",
                 "gioi tinh", "SDT", "dia chi", "ten Ngan Hang", "STK", "so ngay cong", "muc luong", "tong luong");
        for (ThongTinNhanVien ttnv : danhSachNV) {
            System.out.format("%-20d %-20s %-40s %-20s %-30s %-20s %-20s %-20s %-20s %-20d %-20f %-20f \n",
                     ttnv.getMSnv(),
                     ttnv.getTenVn(),
                     ttnv.getChucVu(),
                     ttnv.getNamSinh(),
                     ttnv.getGioiTinh(),
                     ttnv.getSDt(),
                     ttnv.getAddr(),
                     ttnv.getTenNH(),
                     ttnv.getSTk(),
                     ttnv.getSoNgayCong(),
                     ttnv.getMucLuong(),
                     ttnv.getTongLuong());

        }
    }

}
