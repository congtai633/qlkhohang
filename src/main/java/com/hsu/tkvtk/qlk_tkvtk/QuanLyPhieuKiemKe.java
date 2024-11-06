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
public class QuanLyPhieuKiemKe {

    private ArrayList<PhieuKiemKe> danhSachPhieuKemKe = new ArrayList<PhieuKiemKe>();

    public void themPhieuKiemKe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("TEN NHAN VIEN KIEM KE");
        String nhanVienKiemKe = sc.nextLine();

        System.out.println("ID PHIEU KIEM KE");
        int idPhieuKiemKe = sc.nextInt();
        sc.nextLine();
        System.out.println("NGAY KIEM KE");
        String ngayKiemKe = sc.nextLine();

        System.out.println("KET QUA");
        String ketQua = sc.nextLine();

        System.out.println("GHI CHU");
        String ghiChu = sc.nextLine();

        PhieuKiemKe pkk = new PhieuKiemKe(nhanVienKiemKe, idPhieuKiemKe, ngayKiemKe, ketQua, ghiChu);
        danhSachPhieuKemKe.add(pkk);
        System.out.println("THEM PHIEU KIEM KE THANH CONG");
    }

    public void capNhatPhieuKIemKe() {

    }

    public void xoaPhieuKiemKe() {

    }

    public void xemPhieuKiemKe() {
        System.out.format("%-30s %-20s %-20s %-20s %-20s\n", "TEN NHAN VIEN KIEM KE", "ID PHIEU KIEM KE", "NGAY KIEM KE", "KET QUA", "GHI CHU");
        for (PhieuKiemKe pkk : danhSachPhieuKemKe) {
            System.out.format("%-30s %-20d %-20s %-20s %-20s\n",
                     pkk.getNhanVienKiemKe(),
                     pkk.getIdPhieuKiemKe(),
                     pkk.getNgayKiemKe(),
                     pkk.getKetQua(),
                     pkk.getGhiChu());

        }

    }
}
