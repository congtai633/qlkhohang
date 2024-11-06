package com.hsu.tkvtk.qlk_tkvtk;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyPhieuXuat {

    private ArrayList<PhieuXuat> dsPhieuXuat = new ArrayList<>();

    public ArrayList<PhieuXuat> getDsPhieuXuat() {
        return dsPhieuXuat;
    }

    public void setDsPhieuXuat(ArrayList<PhieuXuat> dsPhieuXuat) {
        this.dsPhieuXuat = dsPhieuXuat;
    }

    public void themPhieuXuat() {
        PhieuXuat px = new PhieuXuat();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ID phieu xuat: ");
        px.setIdPhieuXuat(sc.nextLine());

        System.out.print("Nhap ngay xuat: ");
        px.setNgayXuat(sc.nextLine());

        System.out.print("Nhap ID khach hang: ");
        px.setIdKhachHang(sc.nextLine());

        System.out.print("Nhap tong tien: ");
        px.setTongTien(sc.nextDouble());

        System.out.print("Nhap trang thai: ");
        px.setTrangThai(sc.nextLine());

        dsPhieuXuat.add(px);
        System.out.println("Them phieu xuat thanh cong !");
    }

    public void xoaPhieuXuat(String idPhieuXuat) {
        boolean found = false;
        for (PhieuXuat px : dsPhieuXuat) {
            if (px.getIdPhieuXuat().equals(idPhieuXuat)) {
                dsPhieuXuat.remove(px);
                System.out.println("Xoa phieu xuat thanh cong!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay phieu xuat voi ID: " + idPhieuXuat);
        }
    }

    public void capNhatPhieuXuat(String idPhieuXuat) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        for (PhieuXuat px : dsPhieuXuat) {
            if (px.getIdPhieuXuat().equals(idPhieuXuat)) {
                System.out.print("Nhap ngay xuat moi: ");
                px.setNgayXuat(sc.nextLine());

                System.out.print("Nhap ID khach hang moi: ");
                px.setIdKhachHang(sc.nextLine());

                System.out.print("Nhap tong tien moi: ");
                px.setTongTien(sc.nextDouble());

                System.out.print("Nhap trang thai moi: ");
                sc.nextLine(); // Consume newline left-over
                px.setTrangThai(sc.nextLine());

                System.out.println("Cap nhat phieu xuat thanh cong!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay phieu xuat voi ID: " + idPhieuXuat);
        }
    }

    public void xemDanhSachPhieuXuat() {
        System.out.format("%-20s %-20s %-20s %-20s %-20s\n",
                "ID Phieu Xuat", "Ngay Xuat", "ID Khach Hang", "Tong Tien", "Trang Thai");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (PhieuXuat px : dsPhieuXuat) {
            System.out.format("%-20s %-20s %-20s %-20f %-20s\n",
                    px.getIdPhieuXuat(), px.getNgayXuat(), px.getIdKhachHang(),
                    px.getTongTien(), px.getTrangThai());
        }
    }
}
