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
public class QuanlyChinhSachGiaoHang {
    private ArrayList<ChinhSachGiaoHang> dsChinhSachGiaoHang = new ArrayList<ChinhSachGiaoHang>();

    public ArrayList<ChinhSachGiaoHang> getDsChinhSachGiaoHang() {
        return dsChinhSachGiaoHang;
    }

    public void setDsChinhSachGiaoHang(ArrayList<ChinhSachGiaoHang> dsChinhSachGiaoHang) {
        this.dsChinhSachGiaoHang = dsChinhSachGiaoHang;
    }
    
    public void themChinhSachGiaoHang()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ID chinh sach: ");
        int idChinhSach = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten chinh sach: ");
        String tenChinhSach = sc.nextLine();
        System.out.println("Nhap thoi gian giao hang toi da: ");
        int thoiGian = sc.nextInt();
        System.out.println("Nhap don vi thoi gian: ");
        String donViThoiGian = sc.next();
        System.out.println("Nhap phi giao hang: ");
        double phiGiaoHang = sc.nextDouble();
        ChinhSachGiaoHang csgh = new ChinhSachGiaoHang(idChinhSach,tenChinhSach,thoiGian,donViThoiGian,phiGiaoHang);
        dsChinhSachGiaoHang.add(csgh);
        System.out.println("Them Chinh sach giao hang thanh cong!");
    }
    public void capnhatChinhSachGiaoHang()
    {
        boolean bl = false;
        ChinhSachGiaoHang csgh = new ChinhSachGiaoHang();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID chinh sach can tim: ");
        int idcs = sc.nextInt();
        
        for(ChinhSachGiaoHang chinhsachgiaohang : dsChinhSachGiaoHang)
        {
            if(chinhsachgiaohang.getIdChinhSach()==idcs)
            {
                csgh = chinhsachgiaohang;
                bl = true;
                break;
            }
        }
        if(bl==true)
        {
            System.out.println("Nhap phi giao hang can sua: ");
            double pgh = sc.nextDouble();
            csgh.setPhiGiaoHang(pgh);
        }else{
            System.out.println("Khong tim thay ID can tim");
        }
    }
    public void xoaChinhSachGiaoHang()
    {
        boolean bl = false;
        ChinhSachGiaoHang csgh = new ChinhSachGiaoHang();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID chinh sach can tim: ");
        int idcs = sc.nextInt();
        
        for(ChinhSachGiaoHang chinhsachgiaohang : dsChinhSachGiaoHang)
        {
            if(chinhsachgiaohang.getIdChinhSach()==idcs)
            {
                csgh = chinhsachgiaohang;
                bl = true;
                break;
            }
        }
        if(bl==true)
        {
            dsChinhSachGiaoHang.remove(csgh);
        }else{
            System.out.println("Khong tim thay ID can tim");
        }
        
    }
    public void xemdanhsachChinhSachGiaoHang()
    {
        System.out.format("%-20s %-30s %-30s %-20s %-20s\n","ID chinh sach","Ten chinh sach","Thoi gian giao hang toi da","Don vi thoi gian","Phi giao hang");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        for(ChinhSachGiaoHang CSGH : dsChinhSachGiaoHang)
        {
            System.out.format("%-20d %-30s %-30d %-20s %-20f\n",CSGH.getIdChinhSach(),CSGH.getTenChinhSach(),CSGH.getThoiGianGiaoHangToiDa(),CSGH.getDonViThoiGian(),CSGH.getPhiGiaoHang());
        }
    }
    void sortCSGH() {
        Comparator<ChinhSachGiaoHang> compObj = new Comparator<ChinhSachGiaoHang>() {
            @Override
            public int compare(ChinhSachGiaoHang h1, ChinhSachGiaoHang h2) {
                if (h1.getIdChinhSach() > h2.getIdChinhSach()) {
                    return 1;
                } else if (h1.getIdChinhSach()== h2.getIdChinhSach()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(dsChinhSachGiaoHang, compObj);
        //Collections.sort(dsRegion,Comparator.comparing(Region:: getRegionID)); //cach 2
    }
}

