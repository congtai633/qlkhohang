package com.hsu.tkvtk.qlk_tkvtk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLyPhieuNhap {

    private ArrayList<PhieuNhap> dsPhieuNhap = new ArrayList<PhieuNhap>();

    public ArrayList<PhieuNhap> getDsPhieuNhap() {
        return dsPhieuNhap;
    }

    public void setDsPhieuNhap(ArrayList<PhieuNhap> dsPhieuNhap) {
        this.dsPhieuNhap = dsPhieuNhap;
    }
    
    // Phương thức thêm phiếu nhập
    public void themPhieuNhap() {
        PhieuNhap pn = new PhieuNhap();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ID phieu nhap: ");
        pn.setIdPhieuNhap(sc.nextLine());

        System.out.print("Nhap ngay nhap: ");
        pn.setNgayNhap(sc.nextLine());

        System.out.print("Nhap ID nha cung cap: ");
        pn.setIdNhaCC(sc.nextLine());

        System.out.print("Nhap trang thai: ");
        pn.setTrangThai(sc.nextLine());

        System.out.print("Nhap tong tien: ");
        pn.setTongTien(sc.nextDouble());

        dsPhieuNhap.add(pn);
        System.out.println("Them phieu nhap thanh cong!");
    }

    // Phương thức cập nhật phiếu nhập
    public void capNhatPhieuNhap(String idPhieuNhap) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        for (PhieuNhap pn : dsPhieuNhap) {
            if (pn.getIdPhieuNhap().equals(idPhieuNhap)) {
                System.out.print("Nhap ngay nhap moi: ");
                pn.setNgayNhap(sc.nextLine());

                System.out.print("Nhap ID nha cung cap moi: ");
                pn.setIdNhaCC(sc.nextLine());

                System.out.print("Nhap trang thai moi: ");
                pn.setTrangThai(sc.nextLine());

                System.out.print("Nhap tong tien moi: ");
                pn.setTongTien(sc.nextDouble());

                System.out.println("Cap nhat phieu nhap thanh cong!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay phieu nhap voi ID: " + idPhieuNhap);
        }
    }

    // Phương thức xóa phiếu nhập
    public void xoaPhieuNhap(String idPhieuNhap) {
        boolean found = false;
        for (PhieuNhap pn : dsPhieuNhap) {
            if (pn.getIdPhieuNhap().equals(idPhieuNhap)) {
                dsPhieuNhap.remove(pn);
                System.out.println("Xoa phieu nhap thanh cong!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay phieu nhap voi ID: " + idPhieuNhap);
        }
    }

    // Phương thức hiển thị danh sách phiếu nhập
    public void xemDanhSachPhieuNhap() {
        System.out.format("%-20s %-20s %-20s %-20s %-20s\n",
                "ID Phieu Nhap", "Ngay Nhap", "ID Nha CC", "Trang Thai", "Tong Tien");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (PhieuNhap pn : dsPhieuNhap) {
            System.out.format("%-20s %-20s %-20s %-20s %-20f\n",
                    pn.getIdPhieuNhap(), pn.getNgayNhap(), pn.getIdNhaCC(), pn.getTrangThai(),
                    pn.getTongTien());
        }
    }

    // Phương thức sắp xếp danh sách phiếu nhập theo idPhieuNhap
    public void sortByIdPhieuNhap() {
        Comparator<PhieuNhap> compObj = new Comparator<PhieuNhap>() {
            @Override
            public int compare(PhieuNhap o1, PhieuNhap o2) {
                return o1.getIdPhieuNhap().compareTo(o2.getIdPhieuNhap());
            }
        };
        Collections.sort(dsPhieuNhap, compObj);
        System.out.println("Danh sách phiếu nhập đã được sắp xếp theo ID phiếu nhập.");
    }
}
