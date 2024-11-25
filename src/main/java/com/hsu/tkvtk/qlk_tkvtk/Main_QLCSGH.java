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
public class Main_QLCSGH {
    public static void main(String[] args)
    {
        int chucNang;
        Scanner sc = new Scanner(System.in);
        QuanlyChinhSachGiaoHang qlcsgh = new QuanlyChinhSachGiaoHang();
        do{
            System.out.println("1.Nhap chinh sach giao hang");
            System.out.println("2.Cap nhat chinh sach giao hang");
            System.out.println("3.Xoa chinh sach giao hang");
            System.out.println("4.Xem danh sach chinh sach giao hang");
            System.out.println("5.Exit");
            System.out.println("Vui long chon so: ");
            chucNang = sc.nextInt();
            switch(chucNang)
            {
                case 1 -> qlcsgh.themChinhSachGiaoHang();
                case 2 -> qlcsgh.capnhatChinhSachGiaoHang();
                case 3 -> qlcsgh.xoaChinhSachGiaoHang();
                case 4 -> qlcsgh.xemdanhsachChinhSachGiaoHang();
                case 5 -> System.out.println("Thoat chuong trinh");
                default -> System.out.println("Sai cu phap, vui long nhap lai");
            }
        }while(chucNang!=5);
    }
}
