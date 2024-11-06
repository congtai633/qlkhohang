package com.hsu.tkvtk.qlk_tkvtk;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKeHang {

    private ArrayList<KeHang> dsKeHang = new ArrayList<KeHang>();

    public void themKeHang() {
        KeHang kh = new KeHang();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma hang: ");
        kh.setMaHang(sc.nextLine());

        System.out.print("Nhap ID ke: ");
        kh.setIdKe(sc.nextLine());

        System.out.print("Nhap vi tri ke: ");
        kh.setViTriKe(sc.nextLine());

        System.out.print("Nhap loai ke: ");
        kh.setLoaiKe(sc.nextLine());

        System.out.print("Nhap loai hang: ");
        kh.setLoaiHang(sc.nextLine());

        System.out.print("Nhap so tang: ");
        kh.setSoTang(sc.nextInt());

        System.out.print("Nhap so luong: ");
        kh.setSoLuong(sc.nextInt());

        System.out.print("Nhap suc chua(kg): ");
        kh.setSucChua(sc.nextDouble());

        dsKeHang.add(kh);
        System.out.println("Them ke hang thanh cong !");
    }

    public void capNhatKeHang(String maHang) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        for (KeHang kh : dsKeHang) {
            if (kh.getMaHang().equals(maHang)) {
                System.out.print("Nhap ID ke moi: ");
                kh.setIdKe(sc.nextLine());

                System.out.print("Nhap vi tri ke moi: ");
                kh.setViTriKe(sc.nextLine());

                System.out.print("Nhap loai ke moi: ");
                kh.setLoaiKe(sc.nextLine());

                System.out.print("Nhap loai hang moi: ");
                kh.setLoaiHang(sc.nextLine());

                System.out.print("Nhap so tang moi: ");
                kh.setSoTang(sc.nextInt());

                System.out.print("Nhap so luong moi: ");
                kh.setSoLuong(sc.nextInt());

                System.out.print("Nhap suc chua moi (kg): ");
                kh.setSucChua(sc.nextDouble());

                System.out.println("Cap nhat ke hang thanh cong !");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ke hang voi ma hang: " + maHang);
        }
    }

    public void xoaKeHang(String maHang) {
        boolean found = false;
        for (KeHang kh : dsKeHang) {
            if (kh.getMaHang().equals(maHang)) {
                dsKeHang.remove(kh);
                System.out.println("Xoa ke hang thanh cong !");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ke hang voi ma hang: " + maHang);
        }
    }

    public void xemDanhSachKeHang() {
        System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Ma Hang", "ID Ke", "Vi Tri Ke", "Loai Ke", "Loai Hang", "So Tang", "So Luong", "Suc Chua(kg)");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (KeHang kh : dsKeHang) {
            System.out.format("%-20s %-20s %-20s %-20s %-20s %-20d %-20d %-20f\n",
                    kh.getMaHang(), kh.getIdKe(), kh.getViTriKe(), kh.getLoaiKe(),
                    kh.getLoaiHang(), kh.getSoTang(), kh.getSoLuong(), kh.getSucChua());
        }
    }
}
