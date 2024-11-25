/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

import java.util.Scanner;

/**
 *
 * @author taitu
 */
public class Main_QLNCC {
    public static void main (String[] args)
    {
        int chucNang;
        Scanner sc = new Scanner(System.in);
        QuanlyNhaCC qlncc = new QuanlyNhaCC();
        do{
            System.out.println("1.Nhap thong tin nha cung cap");
            System.out.println("2.Cap nhat thong tin nha cung cap");
            System.out.println("3.Xoa nha cung cap");
            System.out.println("4.Xem danh sach nha cung cap");
            System.out.println("5.Sap xep danh sach nha cung cap");
            System.out.println("6.Thoat");
            System.out.println("Vui long chon so: ");
            chucNang = sc.nextInt();
            switch(chucNang)
            {
                case 1 -> qlncc.themNhaCC();
                case 2 -> qlncc.capnhatNhaCC();
                case 3 -> qlncc.xoaNhaCC();
                case 4 -> qlncc.xemDanhSachNhaCC();
                case 5 -> qlncc.sortNCC();
                case 6 -> System.out.println("Thoat chuong trinh");
                default -> System.out.println("Sai cu phap, vui long nhap lai");
            }
        }while(chucNang!=6);
    }
}
