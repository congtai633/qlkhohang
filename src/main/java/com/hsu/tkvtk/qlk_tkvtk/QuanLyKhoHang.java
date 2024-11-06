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
public class QuanLyKhoHang {

    private ArrayList<KhoHang> dsKhoHang = new ArrayList<KhoHang>();

    public void themKhoHang() {
        KhoHang kh = new KhoHang();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap idKhoHang:");
        String id = sc.nextLine();
        kh.setIdKhoHang(id);
        System.out.println("Nhap tenKho:");
        String tk = sc.nextLine();
        kh.setTenKho(tk);
        System.out.println("Nhap diaChi:");
        String dc = sc.nextLine();
        kh.setDiaChi(dc);
        System.out.println("Nhap sucChua(kg):");
        int sucChua = sc.nextInt();
        kh.setSucChua(sucChua);
        sc.nextLine();
        System.out.println("Nhap trangThai:");
        String trangThai = sc.nextLine();
        kh.setTrangThai(trangThai);
        dsKhoHang.add(kh);
        System.out.println("Them kho hang thanh cong");

    }

    public void xemdsKhoHang() {
        System.out.format("%-20s%-20s%-20s%-20s%-20s\n", "idKhoHang", "tenKho", "diaChi", "sucChua(kg)", "trangThai");
        for (KhoHang kh : dsKhoHang) {
            System.out.format("%-20s%-20s%-20s%-20d%-20s\n", kh.getIdKhoHang(), kh.getTenKho(), kh.getDiaChi(), kh.getSucChua(), kh.getTrangThai());
        }

    }

}
