/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main_QLNV {

    public static void main(String[] args) {
        int chucNang;
        Scanner sc = new Scanner(System.in);
        QuanLyNV qlnv = new QuanLyNV();
        do {
            System.out.println(" \nMENU ");
            System.out.println("1.them nhan vien");
            System.out.println("2. cap nhat them nhan vien ");
            System.out.println("3. xoa nhan vien");
            System.out.println("4. xap xep nhan vien theo ma so");
            System.out.println("5. xem danh sach");
            System.out.println("6. THOAT");
            System.out.println("CHON CHUC NANG");
            chucNang = sc.nextInt();
            switch (chucNang) {
                case 1 ->
                    qlnv.themNV();
                case 2 ->
                    qlnv.capNhatNV();
                case 3 ->
                    qlnv.xoaNV();
                case 4 ->
                    qlnv.sortNV();
                case 5 ->
                    qlnv.xemDanhSach();
                case 6 ->
                    System.out.println("thoat chuong trinh");
                default ->
                    System.out.println("sai cu phap");
            }
        } while (chucNang != 6);
    }

}
