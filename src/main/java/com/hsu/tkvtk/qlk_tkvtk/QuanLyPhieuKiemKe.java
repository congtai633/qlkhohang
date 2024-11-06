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
public class QuanLyPhieuKiemKe {

    private ArrayList<PhieuKiemKe> danhSachPhieuKemKe = new ArrayList<PhieuKiemKe>();

    public ArrayList<PhieuKiemKe> getDanhSachPhieuKemKe() {
        return danhSachPhieuKemKe;
    }

    public void setDanhSachPhieuKemKe(ArrayList<PhieuKiemKe> danhSachPhieuKemKe) {
        this.danhSachPhieuKemKe = danhSachPhieuKemKe;
    }

    public void themPhieuKiemKe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("TEN NHAN VIEN KIEM KE");
        String nhanVienKiemKe = sc.nextLine();

        System.out.println("ID PHIEU KIEM KE");
        int idPhieuKiemKe = sc.nextInt();
        sc.nextLine();
        System.out.println("NGAY KIEM KE");
        String ngayKiemKe = sc.nextLine();

        System.out.println("KET QUA");
        String ketQua = sc.nextLine();

        System.out.println("GHI CHU");
        String ghiChu = sc.nextLine();

        PhieuKiemKe pkk = new PhieuKiemKe(nhanVienKiemKe, idPhieuKiemKe, ngayKiemKe, ketQua, ghiChu);
        danhSachPhieuKemKe.add(pkk);
        System.out.println("THEM PHIEU KIEM KE THANH CONG");
    }

      public void capNhatPhieuKIemKe(){
         boolean c=false;
        PhieuKiemKe kk= new PhieuKiemKe();
        Scanner sc= new Scanner(System.in);
        System.out.println("ID PHIEU CAN TIM");
        int id= sc.nextInt();
        for(PhieuKiemKe phieuKiemKe : danhSachPhieuKemKe){
            if(phieuKiemKe.getIdPhieuKiemKe()==id){
                kk = phieuKiemKe;
                c=true;
                break;
            }
        }
        if(c==true){
            System.out.println("nhap ten can sua: ");
            String tenNv=sc.nextLine();
            kk.setNhanVienKiemKe(tenNv);
        }else
        {
            System.out.println("khong tim thay!");
        }
       xemPhieuKiemKe();
    }
    public void xoaPhieuKiemKe(){
         boolean c=false;
        PhieuKiemKe xkk= new PhieuKiemKe();
        Scanner sc= new Scanner(System.in);
        System.out.println("ID PHIEU CAN TIM");
        int id= sc.nextInt();
        for(PhieuKiemKe phieuKiemKe : danhSachPhieuKemKe){
            if(phieuKiemKe.getIdPhieuKiemKe()==id){
                xkk = phieuKiemKe;
                c=true;
                break;
            }
        }
        if(c==true){
            danhSachPhieuKemKe.remove(xkk);
        }else
        {
            System.out.println("khong tim thay!");
        }
        
        
        xemPhieuKiemKe();
        
    }

    public void xemPhieuKiemKe() {
        System.out.format("%-30s %-20s %-20s %-20s %-20s\n", "TEN NHAN VIEN KIEM KE", "ID PHIEU KIEM KE", "NGAY KIEM KE", "KET QUA", "GHI CHU");
        for (PhieuKiemKe pkk : danhSachPhieuKemKe) {
            System.out.format("%-30s %-20d %-20s %-20s %-20s\n",
                     pkk.getNhanVienKiemKe(),
                     pkk.getIdPhieuKiemKe(),
                     pkk.getNgayKiemKe(),
                     pkk.getKetQua(),
                     pkk.getGhiChu());

        }

    }
}
