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
public class Main_QLLH {

    public static void main(String[] args) {
        int chucNang;
        Scanner sc = new Scanner(System.in);
        QuanLyLoHang qllh = new QuanLyLoHang();
        do {
            System.out.println("1.Nhap thong tin lo hang");
            System.out.println("2.Cap nhat thong tin lo hang");
            System.out.println("3.Xoa lo hang");
            System.out.println("4.Xem danh sach lo hang");
            System.out.println("5.Sap xep  lo hang");
            System.out.println("6.Exit");
            System.out.println("Vui long chon so:");
            chucNang = sc.nextInt();
            switch (chucNang) {
                case 1 ->
                    qllh.themLohang();
                case 2 ->
                    qllh.capnhatLh();
                case 3 ->
                    qllh.xoaLh();
                case 4 ->
                    qllh.xemLh();
                case 5 ->
                    qllh.sortByidLh();
                case 6 ->
                    System.out.println("Thoat chuong trinh");
                default ->
                    System.out.println("Sai cu phap , vui long nhap lai ");

            }

        } while (chucNang != 6);

    }

}
