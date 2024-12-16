/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

import java.util.Scanner;

/**
 *
 * @author Nguye
 */
public class Main_QLKH {
    public static void main(String[] args) {
        int chucNang;
        Scanner sc = new Scanner(System.in);
        QuanLyKhoHang QLKH = new QuanLyKhoHang();

        do {
            System.out.println("Chon chuc nang:");
            System.out.println("1. Nhap thong tin kho hang");
            System.out.println("2. Cap nhat thong tin kho hang ");
            System.out.println("3. Xoa kho hang");
            System.out.println("4. Xem danh sach kho hang ");
            System.out.println("5. Sap xep danh sach hoa don");
            System.out.println("6. Thoat");
            System.out.print("Vui long chon so: ");
            chucNang = sc.nextInt();
            switch(chucNang)
            {
                case 1 -> QLKH.themKhoHang();
                case 2 -> QLKH.capnhatKhoHang();
                case 3 -> QLKH.xoaKhoHang();
                case 4 -> QLKH.xemdsKhoHang();
                case 5 -> QLKH.sortKhoHang();
                case 6 -> System.out.println("Thoat chuong trinh");
                default -> System.out.println("Sai cu phap,vui long nhap lai");
                
            }
            
        } while (chucNang != 6);

        sc.close();
    }
} 
