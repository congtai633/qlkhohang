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
public class Main_QLPKK
{
    public static void main(String[] args) {
        int chucNang;
       Scanner sc=new Scanner(System.in);
       QuanLyPhieuKiemKe qlpkk=new QuanLyPhieuKiemKe ();
       do{
            System.out.println(" \nMENU ");
            System.out.println("1.them phieu kiem ke");
            System.out.println("2. cap nhat them phieu kiem ke ");
            System.out.println("3. xoa phieu kiem ke");
            System.out.println("4. xap xep phieu theo ID phieu");
            System.out.println("5. xem danh sach");
            System.out.println("6. THOAT");
            System.out.println("CHON CHUC NANG");
            chucNang=sc.nextInt();
            switch(chucNang){
                case 1 -> qlpkk.themPhieuKiemKe();
                case 2 -> qlpkk.capNhatPhieuKIemKe();
                case 3 -> qlpkk.xoaPhieuKiemKe();
                case 4 -> qlpkk.sortPhieuKiemKe();
                case 5 -> qlpkk.xemPhieuKiemKe();
                case 6 -> System.out.println("thoat chuong trinh");
                default -> System.out.println("sai cu phap");
                    }
       }
       while(chucNang!=6);      
    }
    }
            
    

