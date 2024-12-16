/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tkvtk.qlk_tkvtk;

/**
 *
 * @author taitu
 */
import java.util.Scanner;

public class Main_QL_KEHANG_PN_PX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyKeHang qlkh = new QuanLyKeHang();
        QuanLyPhieuNhap qlpn = new QuanLyPhieuNhap();
        QuanLyPhieuXuat qlpx = new QuanLyPhieuXuat();

        // Goi truc tiep vao menu can dung (thay doi tuy nhu cau)
        menuKeHang(qlkh, scanner);
        // Hoac
        // menuPhieuNhap(qlpn, scanner);
        // Hoac
        // menuPhieuXuat(qlpx, scanner);

        scanner.close();
    }

    private static void menuKeHang(QuanLyKeHang qlkh, Scanner scanner) {
        int chucNang;
        do {
            System.out.println("\n=== Quan ly ke hang ===");
            System.out.println("1. Them ke hang");
            System.out.println("2. Cap nhat ke hang");
            System.out.println("3. Xoa ke hang");
            System.out.println("4. Xem danh sach ke hang");
            System.out.println("5. Sap xep ke hang theo ID ke");
            System.out.println("6. Quay lai menu chinh");
            System.out.print("Chon chuc nang: ");
            chucNang = getIntInput(scanner);

            switch (chucNang) {
                case 1:
                    qlkh.themKeHang();
                    break;
                case 2:
                    System.out.print("Nhap ma hang can cap nhat: ");
                    scanner.nextLine(); // Consume newline
                    String maHangCapNhat = scanner.nextLine();
                    qlkh.capNhatKeHang(maHangCapNhat);
                    break;
                case 3:
                    System.out.print("Nhap ma hang can xoa: ");
                    scanner.nextLine(); // Consume newline
                    String maHangXoa = scanner.nextLine();
                    qlkh.xoaKeHang(maHangXoa);
                    break;
                case 4:
                    qlkh.xemDanhSachKeHang();
                    break;
                case 5:
                    qlkh.sortKeHang();
                    break;
                case 6:
                    System.out.println("Quay lai menu chinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Hay chon lai.");
            }
        } while (chucNang != 6);
    }

    private static void menuPhieuNhap(QuanLyPhieuNhap qlpn, Scanner scanner) {
        int chucNang;
        do {
            System.out.println("\n=== Quan ly phieu nhap ===");
            System.out.println("1. Them phieu nhap");
            System.out.println("2. Cap nhat phieu nhap");
            System.out.println("3. Xoa phieu nhap");
            System.out.println("4. Xem danh sach phieu nhap");
            System.out.println("5. Sap xep phieu nhap theo ID");
            System.out.println("6. Quay lai menu chinh");
            System.out.print("Chon chuc nang: ");
            chucNang = getIntInput(scanner);

            switch (chucNang) {
                case 1:
qlpn.themPhieuNhap();
                    break;
                case 2:
                    System.out.print("Nhap ID phieu nhap can cap nhat: ");
                    scanner.nextLine(); // Consume newline
                    String idPhieuNhapCapNhat = scanner.nextLine();
                    qlpn.capNhatPhieuNhap(idPhieuNhapCapNhat);
                    break;
                case 3:
                    System.out.print("Nhap ID phieu nhap can xoa: ");
                    scanner.nextLine(); // Consume newline
                    String idPhieuNhapXoa = scanner.nextLine();
                    qlpn.xoaPhieuNhap(idPhieuNhapXoa);
                    break;
                case 4:
                    qlpn.xemDanhSachPhieuNhap();
                    break;
                case 5:
                    qlpn.sortByIdPhieuNhap();
                    break;
                case 6:
                    System.out.println("Quay lai menu chinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Hay chon lai.");
            }
        } while (chucNang != 6);
    }

    private static void menuPhieuXuat(QuanLyPhieuXuat qlpx, Scanner scanner) {
        int chucNang;
        do {
            System.out.println("\n=== Quan ly phieu xuat ===");
            System.out.println("1. Them phieu xuat");
            System.out.println("2. Cap nhat phieu xuat");
            System.out.println("3. Xoa phieu xuat");
            System.out.println("4. Xem danh sach phieu xuat");
            System.out.println("5. Sap xep phieu xuat theo ID");
            System.out.println("6. Quay lai menu chinh");
            System.out.print("Chon chuc nang: ");
            chucNang = getIntInput(scanner);

            switch (chucNang) {
                case 1:
                    qlpx.themPhieuXuat();
                    break;
                case 2:
                    System.out.print("Nhap ID phieu xuat can cap nhat: ");
                    scanner.nextLine(); // Consume newline
                    String idPhieuXuatCapNhat = scanner.nextLine();
                    qlpx.capNhatPhieuXuat(idPhieuXuatCapNhat);
                    break;
                case 3:
                    System.out.print("Nhap ID phieu xuat can xoa: ");
                    scanner.nextLine(); // Consume newline
                    String idPhieuXuatXoa = scanner.nextLine();
                    qlpx.xoaPhieuXuat(idPhieuXuatXoa);
                    break;
                case 4:
                    qlpx.xemDanhSachPhieuXuat();
                    break;
                case 5:
                    qlpx.sortByIdPhieuXuat();
                    break;
                case 6:
                    System.out.println("Quay lai menu chinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le! Hay chon lai.");
            }
        } while (chucNang != 6);
    }
    
    private static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Dau vao khong hop le! Hay nhap mot so nguyen.");
            System.out.print("Chon chuc nang: ");
            scanner.next(); // Bo qua dau vao khong hop le
        }
        return scanner.nextInt();
    }
}