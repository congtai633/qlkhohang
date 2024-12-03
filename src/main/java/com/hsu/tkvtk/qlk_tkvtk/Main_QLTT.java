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
public class Main_QLTT {
    public static void main(String[] args)
    {
        int chucNang;
        Scanner sc = new Scanner(System.in);
        QuanlyThanhToan qltt = new QuanlyThanhToan();
        do{
            System.out.println("1.Nhap phieu thanh toan");
            System.out.println("2.Cap nhat phieu thanh toan");
            System.out.println("3.Xoa phieu thanh toan");
            System.out.println("4.Xem danh sach thanh toan");
            System.out.println("5.Sap xep danh sach thanh toan");
            System.out.println("6.Thoat");
            System.out.println("Vui long chon so: ");
            chucNang = sc.nextInt();
            switch(chucNang)
            {
                case 1 -> qltt.themThanhToan();
                case 2 -> qltt.capnhatThanhToan();
                case 3 -> qltt.xoaThanhToan();
                case 4 -> qltt.xemDanhSachThanhToan();
                case 5 -> qltt.sortThanhToan();
                case 6 -> System.out.println("Thoat chuong trinh");
                default -> System.out.println("Sai cu phap, vui long nhap lai");
            }
        }while(chucNang!=6);
    }
}
