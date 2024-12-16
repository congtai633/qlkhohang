/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public void capnhatHoaDon() {
        boolean c = false;
        HoaDon hd = new HoaDon();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so thue can tim:");
        String mst = sc.nextLine();
        for (HoaDon hoadon : dsHoaDon) {
            if (hoadon.getMaSoThue().equals(mst)) {
                hd = hoadon;
                c = true;
                break;
            }
        }

        if (c == true) {
            System.out.println("Nhap ten doanh nghiep can sua ");
            String tenDN = sc.nextLine();
            hd.setTenDoanhNghiep(tenDN);
        } else {
            System.out.println("khong tim thay");
        }

    }

    public void xoaHoaDon() {
        boolean c = false;
        HoaDon hd = new HoaDon();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap don Vi Tinh can xoa:");
        int dvt = sc.nextInt();
        for (HoaDon hoadon : dsHoaDon) {
            if (hoadon.getDonViTinh() == dvt) {
                hd = hoadon;
                c = true;
                break;

            }
        }
        if (c == true) {
            dsHoaDon.remove(hd);
        } else {
            System.out.println("khong tim thay");
        }
    }

    public void xemdsHoaDon() {
        System.out.format("%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s\n", "tenDoanhNghiep", "diaChiDoanhNghiep", "maSoThue", "sDT", "tenKhachHang", "diaChiKhachHang", "maSoThueKhachHang", "sDTKhachHang", "tenSanPham", "maSanPham", "donViTinh", "soLuong", "donGia", "thanhTien");
        for (HoaDon hd : dsHoaDon) {
            System.out.format("%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30s%-30d%-30d%-30d%-30f\n", hd.getTenDoanhNghiep(), hd.getDiaChiDoanhNghiep(), hd.getMaSoThue(), hd.getsDT(), hd.getTenKhachHang(), hd.getDiaChiKhachHang(), hd.getMaSoThueKhachHang(), hd.getsDTKhachHang(), hd.getTenSanPham(), hd.getMaSanPham(), hd.getDonViTinh(), hd.getSoLuong(), hd.getDonGia(), hd.getThanhTien());

        }
    }
    public void sortHoaDon() {
        Comparator<HoaDon> compObj = new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon hd1, HoaDon hd2) {
                if (hd1.getMaSanPham().compareTo(hd2.getMaSanPham()) > 0) {
                    return 1;
                } else if (hd1.getMaSanPham().compareTo(hd2.getMaSanPham()) == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(dsHoaDon, compObj);
    }

}
