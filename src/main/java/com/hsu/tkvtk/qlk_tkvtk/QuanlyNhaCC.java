/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author taitu
 */
public class QuanlyNhaCC {
    private ArrayList<NhaCC> dsNhaCC = new ArrayList<NhaCC>();

    public ArrayList<NhaCC> getDsNhaCC() {
        return dsNhaCC;
    }

    public void setDsNhaCC(ArrayList<NhaCC> dsNhaCC) {
        this.dsNhaCC = dsNhaCC;
    }
    
    public void themNhaCC()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID NhaCC: ");
        String id = sc.nextLine();
        System.out.println("Nhap ten NhaCC: ");
        String ten = sc.nextLine();
        System.out.println("Nhap dia chi NhaCC: ");
        String diachi = sc.nextLine();
        System.out.println("Nhap sdt NhaCC: ");
        String sdt = sc.nextLine();
        System.out.println("Nhap email NhaCC: ");
        String email = sc.nextLine();
        System.out.println("Nhap nguoi lien he : ");
        String nguoiLH = sc.nextLine();
        System.out.println("Nhap loai hang hoa: ");
        String loaiHH = sc.nextLine();  
        //note : xài nextline nếu toàn bộ là String, còn xài next để được cho phép nhập số hoặc khác cho các lần nhập tiếp theo.
        NhaCC ncc = new NhaCC(id,ten,diachi,sdt,email,nguoiLH,loaiHH);
        //them nhaCC vao ds
        dsNhaCC.add(ncc);
        System.out.println("Them Nha Cung Cap thanh cong!");
    }
    public void capnhatNhaCC()
    {
        //tim id nhacc de cap nhat
        boolean bl = false;
        NhaCC ncc = new NhaCC();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID NCC can tim: ");
        String id = sc.nextLine();
        
        for( NhaCC nhacc : dsNhaCC)
        {
            if(nhacc.getIdNhaCC().equals(id))
            {
                ncc = nhacc;
                bl = true;
                break;
            }
        }
        //cap nhat
        if(bl == true)
        {
            System.out.println("Nhap SDT can sua: ");
            String sdt = sc.nextLine();
            ncc.setSoDienThoai(sdt);
        }else{
            System.out.println("Khong tim thay ID NCC can tim");
        }
        //in lai dsncc
        xemDanhSachNhaCC();
    }
    public void xoaNhaCC()
    {
       boolean bl = false;
       NhaCC ncc = new NhaCC();
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap ID can tim: ");
       String id = sc.nextLine();
       
       for(NhaCC nhacc : dsNhaCC)
       {
           if(nhacc.getIdNhaCC().equals(id))
           {
               ncc = nhacc;
               bl = true; 
               break;
           }
       }
       
       if(bl==true)
       {
           dsNhaCC.remove(ncc);
       }else{
           System.out.println("Khong tim thay ID NCC can xoa");
       }
       xemDanhSachNhaCC();
    }
    public void xemDanhSachNhaCC()
    {
        System.out.format("%-20s %-20s %-40s %-20s %-30s %-20s %-20s\n","Id","Ten","Dia chi","Sdt","Email","NguoiLH","LoaiHH");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(NhaCC ncc : dsNhaCC)
        {
            System.out.format("%-20s %-20s %-40s %-20s %-30s %-20s %-20s\n",ncc.getIdNhaCC(),ncc.getTenNhaCC(),ncc.getDiaChi(),ncc.getSoDienThoai(),ncc.getEmail(),ncc.getNguoiLienHe(),ncc.getLoaiHangHoa());
        }
    }
}
