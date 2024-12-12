/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author taitu
 */
public class QuanlyThanhToan {
    private ArrayList<ThanhToan> dsThanhToan = new ArrayList<ThanhToan>();

    public ArrayList<ThanhToan> getDsThanhToan() {
        return dsThanhToan;
    }

    public void setDsThanhToan(ArrayList<ThanhToan> dsThanhToan) {
        this.dsThanhToan = dsThanhToan;
    }



    
    public void themThanhToan()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID thanh toan: ");
        String id = sc.nextLine();
        System.out.println("Nhap ngay thanh toan: ");
        String ngay = sc.nextLine();
        System.out.println("Nhap phuong thuc thanh toan: ");
        String phuongthuc = sc.nextLine();
        System.out.println("Nhap trang thai: ");
        String trangthai = sc.nextLine();
        System.out.println("Nhap so tien: ");
        double tien = sc.nextDouble();
        //note : xài nextline nếu toàn bộ là String, còn xài next để được cho phép nhập số hoặc khác cho các lần nhập tiếp theo.
        ThanhToan tt = new ThanhToan(id,ngay,tien,phuongthuc,trangthai);
       
        dsThanhToan.add(tt);
        System.out.println("Them phieu thanh toan thanh cong!");
    }
    public void capnhatThanhToan()
    {
        //tim id nhacc de cap nhat
        boolean bl = false;
        ThanhToan tt = new ThanhToan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID thanh toan can tim: ");
        String id = sc.nextLine();
        
        for( ThanhToan thanhtoan : dsThanhToan)
        {
            if(thanhtoan.getIdThanhToan().equals(id))
            {
                tt=thanhtoan;
                bl = true;
                break;
            }
        }
        //cap nhat
        if(bl == true)
        {
            System.out.println("Nhap so tien can sua: ");
            double sotien = sc.nextDouble();
            tt.setSoTien(sotien);
        }else{
            System.out.println("Khong tim thay ID thanh toan can tim");
        }
    }
    public void xoaThanhToan()
     {
        //tim id nhacc de cap nhat
        boolean bl = false;
        ThanhToan tt = new ThanhToan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID thanh toan can tim: ");
        String id = sc.nextLine();
        
        for( ThanhToan thanhtoan : dsThanhToan)
        {
            if(thanhtoan.getIdThanhToan().equals(id))
            {
                tt=thanhtoan;
                bl = true;
                break;
            }
        }
        //xoa
        if(bl == true)
        {
            dsThanhToan.remove(tt);
        }else{
            System.out.println("Khong tim thay ID thanh toan can tim");
        }
    }
    public void xemDanhSachThanhToan()
    {
        System.out.format("%-20s %-20s %-20s %-30s %-20s\n","ID","Ngay","So Tien","Phuong thuc thanh toan","Trang thai");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(ThanhToan tt : dsThanhToan)
        {
            System.out.format("%-20s %-20s %-20f %-30s %-20s\n",tt.getIdThanhToan(),tt.getNgayThanhToan(),tt.getSoTien(),tt.getPhuongThucThanhToan(),tt.getTrangThai());
        }
    }
    void sortThanhToan() {
        Comparator<ThanhToan> compObj = new Comparator<ThanhToan>() {
            @Override
            public int compare(ThanhToan t1, ThanhToan t2) {
                if (t1.getIdThanhToan().compareTo(t2.getIdThanhToan())> 0) {
                    return 1;
                } else if (t1.getIdThanhToan().equals(t2.getIdThanhToan())) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(dsThanhToan, compObj);
        //Collections.sort(dsRegion,Comparator.comparing(Region:: getRegionID)); //cach 2
    }
}


