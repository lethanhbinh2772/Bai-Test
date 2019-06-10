/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author ZzZ
 */
public class main {

    public static void main(String[] args) {
        QuanLySach quanLy = new QuanLySach();
        System.out.println("-----Chuong trinh quan ly tai lieu-----");
        System.out.println("1. Nhap thong tin tai lieu"
                + "2.Hien thi thong tin tai lieu"
                + "3.Sap xep"
                + "4.Thoat");
        System.out.println("Nhap vao lua chon");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        do {
            switch (n) {
                case 1:
                    System.out.println("Ban muon nhap thong tin cho loai tai lieu nao?"
                            + "1.Sach"
                            + "2.Bao"
                            + "3.Tap Chi");
                    int n1 = input.nextInt();
                    if (n1 == 1) {
                        quanLy.nhapThongTinSach();
                    } else if (n1 == 2) {
                        quanLy.nhapThongTinBao();
                    } else if (n1 == 3) {
                        quanLy.nhapThongTinTC();
                    } else {
                        System.err.println("Khong hop le");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Ban muon hien thi thong tin loai tai lieu nao?"
                            + "1.Sach"
                            + "2.Bao"
                            + "3.Tap Chi");
                    int n2 = input.nextInt();
                    if (n2 == 1) {
                        quanLy.hienThiTTSach();
                    } else if (n2 == 2) {
                        quanLy.hienThiTTBao();
                    } else if (n2 == 3) {
                        quanLy.hienThiTTTC();
                    } else {
                        System.err.println("Khong hop le");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Dang phat trien");
                    //quanLy.TimKiem();
                    break;
                case 4:
                    System.out.println("Cam on ban da su dung dich vu cua Binh");
                    System.exit(0);
            }

        } while (n >= 1 && n <= 4);
    }

}
