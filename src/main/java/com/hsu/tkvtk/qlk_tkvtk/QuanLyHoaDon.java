/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguye
 */
public class QuanLyHoaDon {

    private ArrayList<HoaDon> dsHoaDon = new ArrayList<HoaDon>();

    public void themHoaDon() {
        HoaDon hd = new HoaDon();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tenDoanhNghiep:");
        String tenDoanhNghiep = sc.nextLine();
        hd.setTenDoanhNghiep(tenDoanhNghiep);
        System.out.println("Nhap maSoThue");
        String maSoThue = sc.nextLine();
        hd.setMaSoThue(maSoThue);
        System.out.println("Nhap diachiDoanhNghiep");
        String diaChiDoanhNghiep = sc.nextLine();
        hd.setDiaChiDoanhNghiep(diaChiDoanhNghiep);
        System.out.println("Nhap sDT");
        String sDT = sc.nextLine();
        hd.setsDT(sDT);
        System.out.println("Nhap tenKhachHang");
        String tenKhachHang = sc.nextLine();
        hd.setTenKhachHang(tenKhachHang);
        System.out.println("Nhap diachiKhachHang");
        String diaChiKhachHang = sc.nextLine();
        hd.setDiaChiKhachHang(diaChiKhachHang);
        System.out.println("maSoThueKhachHang");
        String maSoThueKhachHang = sc.nextLine();
        hd.setMaSoThueKhachHang(maSoThueKhachHang);
        System.out.println("sDTKhachHang");
        String sDTKhachHang = sc.nextLine();
        hd.setsDTKhachHang(sDTKhachHang);
        System.out.println("tenSanPham");
        String tenSanPham = sc.nextLine();
        hd.setTenSanPham(tenSanPham);
        System.out.println("maSanPham");
        String maSanPham = sc.nextLine();
        hd.setMaSanPham(maSanPham);
        System.out.println("donViTinh");
        int donViTinh = sc.nextInt();
        hd.setDonViTinh(donViTinh);
        System.out.println("soLuong");
        int soLuong = sc.nextInt();
        hd.setSoLuong(soLuong);
        System.out.println("donGia");
        int donGia = sc.nextInt();
        hd.setDonGia(donGia);
        System.out.println("thanhTien");
        float thanhTien = sc.nextFloat();
        hd.setThanhTien(thanhTien);
        dsHoaDon.add(hd);
        System.out.println("them hoa don thanh cong");

    }

    public void xemdsHoaDon() {
        System.out.format("%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s\n", "tenDoanhNghiep", "diaChiDoanhNghiep", "maSoThue", "sDT", "tenKhachHang", "diaChiKhachHang", "maSoThueKhachHang", "sDTKhachHang", "tenSanPham", "maSanPham", "donViTinh", "soLuong", "donGia", "thanhTien");
        for (HoaDon hd : dsHoaDon) {
            System.out.format("%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30d%-30d%-30d%-30f\n", hd.getTenDoanhNghiep(), hd.getDiaChiDoanhNghiep(), hd.getMaSoThue(), hd.getsDT(), hd.getTenKhachHang(), hd.getDiaChiKhachHang(), hd.getMaSoThueKhachHang(), hd.getsDTKhachHang(), hd.getTenSanPham(), hd.getMaSanPham(), hd.getDonViTinh(), hd.getSoLuong(), hd.getDonGia(), hd.getThanhTien());

        }
    }
}
