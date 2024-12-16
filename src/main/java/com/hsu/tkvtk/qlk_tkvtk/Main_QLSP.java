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
public class Main_QLSP {

    public static void main(String[] args) {
        int chucNang;
        Scanner sc = new Scanner(System.in);
        QuanLySanPham qlsp=new QuanLySanPham();
        do {
            System.out.println("1.Nhap thong tin san pham");
            System.out.println("2.Cap nhat thong tin san pham");
            System.out.println("3.Xoa san pham");
            System.out.println("4.Xem danh sach san pham");
            System.out.println("5.Sap xep sach san pham");
            System.out.println("6.Exit");
            System.out.println("Vui long chon so:");
            chucNang=sc.nextInt();
            switch(chucNang){
                case 1 -> qlsp.themSp();
                case 2 -> qlsp.capnhatSp();
                case 3 -> qlsp.xoaSp();
                case 4 -> qlsp.xemSp();
                case 5 -> qlsp.sortByidSp();
                case 6 -> System.out.println("Thoat chuong trinh");
                default -> System.out.println("Sai cu phap , vui long nhap lai ");
                
            }

        }while (chucNang!=6);
            
        
        

        }
}
