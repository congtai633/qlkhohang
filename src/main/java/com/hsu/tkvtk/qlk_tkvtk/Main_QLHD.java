/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

import java.util.Scanner;

public class Main_QLHD {

    public static void main(String[] args) {
        int chucNang;
        Scanner sc = new Scanner(System.in);
        QuanLyHoaDon QLHD = new QuanLyHoaDon();

        do {
            System.out.println("Chon chuc nang:");
            System.out.println("1. Nhap thong tin hoa don");
            System.out.println("2. Cap nhat thong tin hoa don ");
            System.out.println("3. Xoa Hoa Don");
            System.out.println("4. Xem danh sach hoa don ");
            System.out.println("5.Sap xep danh sach thanh toan");
            System.out.println("6. Thoat");
            System.out.print("Vui long chon so: ");
            chucNang = sc.nextInt();
            switch (chucNang) {
                case 1 ->
                    QLHD.themHoaDon();
                case 2 ->
                    QLHD.capnhatHoaDon();
                case 3 ->
                    QLHD.xoaHoaDon();
                case 4 ->
                    QLHD.xemdsHoaDon();
                case 5 ->
                    QLHD.sortHoaDon();
                case 6 ->
                    System.out.println("Thoat chuong trinh");
                default ->
                    System.out.println("Sai cu phap,vui long nhap lai");

            }

        } while (chucNang != 6);
    }
}
