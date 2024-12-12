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
public class QuanLySanPham {

    private ArrayList<SanPham> dsSp = new ArrayList<SanPham>();

    public ArrayList<SanPham> getDsSp() {
        return dsSp;
    }

    public void setDsSp(ArrayList<SanPham> dsSp) {
        this.dsSp = dsSp;
    }

    public void themSp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten Sp:");
        String ten = sc.nextLine();
        System.out.println("Nhap id Sp:");
        String id = sc.nextLine();
        System.out.println("Nhap gia Sp");
        float gia = sc.nextFloat();
        System.out.println("Nhap so luong :");
        int soluong = sc.nextInt();
        SanPham Sp = new SanPham(id, ten, gia, soluong);
        dsSp.add(Sp);
        System.out.println("Them san pham thanh cong !");
    }

    public void xoaSp() {
        // B1 tim doi tuong can xoa
        boolean c = false;
        SanPham Sp = new SanPham();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ID can xoa :");
        String idSp = sc.nextLine();
        for (SanPham SanPham : dsSp) {
            if (SanPham.getIdSp().equals(idSp)) {
                Sp = SanPham;
                c = true;
                break;

            }
        }
        //B2 xoa
        if (c == true) {
            dsSp.remove(Sp);
        } else {
            System.out.println("khong tim thay");
        }
        //B3
        

    }

    public void capnhatSp() {
        //B1 tim
        boolean c = false;
        SanPham Sp = new SanPham();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ID can xoa :");
        String idSp = sc.nextLine();
        for (SanPham SanPham : dsSp) {
            if (SanPham.getIdSp().equals(idSp)) {
                Sp = SanPham;
                c = true;
                break;

            }
        }
        // B2 cap nhat 
        if (c == true) {
            System.out.println("nhap ten can sua");
            String tenSp = sc.next();
            Sp.setTenSp(tenSp);
        } else {
            System.out.println("khong tim thay ");
        }
        
    }

    public void xemSp() {
        System.out.format("%-20s%-20s%-20s%-20s\n", "ID", "Ten SP", "Gia", "So luong");
        for (SanPham Sp : dsSp) {
            System.out.format("%-20s%-20s%-20f%-20d\n", Sp.getIdSp(), Sp.getTenSp(), Sp.getGiaSp(), Sp.getSoLuong());
        }
    }

}
