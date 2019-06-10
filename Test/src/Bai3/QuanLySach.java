/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.Scanner;
import Bai3.TaiLieu;


public class QuanLySach {
   TaiLieu quanLy = new TaiLieu();
   Sach quanLySach = new Sach();
   Bao quanLyBao = new Bao();
   TapChi quanLyTC = new TapChi();
    public void nhapThongTin(){
        System.out.println("Nhap vao ma tai lieu: ");
        Scanner input = new Scanner(System.in);
        quanLy.maTaiLieu = input.nextLine();
        quanLy.setMaTaiLieu(quanLy.maTaiLieu);
        
        System.out.println("Nhap vao ten NXB: ");
        quanLy.tenNXB = input.nextLine();
        quanLy.setTenNXB(quanLy.tenNXB);
        
        System.out.println("Nhap vao so ban phat hanh");
        Scanner input2 = new Scanner(System.in);
        quanLy.soBanPH = input2.nextInt();
        quanLy.setSoBanPH(quanLy.soBanPH);
    }
    public void nhapThongTinSach(){
        System.out.println("Nhap ten tac gia: ");
        Scanner input = new Scanner(System.in);
        quanLySach.tenTacGia = input.nextLine();
        quanLySach.setTenTacGia(quanLySach.tenTacGia);
        
        System.out.println("Nhap so trang: ");
        quanLySach.soTrang = input.nextInt();
        quanLySach.setSoTrang(quanLySach.soTrang);
    }
    public void nhapThongTinBao(){
        System.out.println("Nhap ngay phat hanh: ");
        Scanner input = new Scanner(System.in);
        quanLyBao.ngayPhatHanh= input.nextLine();
        quanLyBao.setNgayPhatHanh(quanLyBao.ngayPhatHanh);
    }
    public void nhapThongTinTC(){
        System.out.println("Nhap so phat hanh: ");
        Scanner input = new Scanner(System.in);
        quanLyTC.soPhatHanh = input.nextInt();
        quanLyTC.setSoPhatHanh(quanLyTC.soPhatHanh);
        
        System.out.println("Nhap thang phat hanh: ");
        quanLyTC.thangPhatHanh = input.nextInt();
        quanLyTC.setThangPhatHanh(quanLyTC.thangPhatHanh);
    }
    public void hienThiTT(){
        System.out.println("Ma tai lieu: "+ quanLy.getMaTaiLieu()
                + "Ten nha xuat ban: "+ quanLy.getTenNXB()
                + "So ban phat hanh: "+ quanLy.getSoBanPH());
    }
    public void hienThiTTSach(){
        System.out.println("Ten tac gia: "+quanLySach.getTenTacGia()
                + "So trang: "+quanLySach.getSoTrang());
    }
    public void hienThiTTBao(){
        System.out.println("Ngay phat hanh: "+quanLyBao.getNgayPhatHanh());
    }
    public void hienThiTTTC(){
        System.out.println("So phat hanh: "+quanLyTC.getSoPhatHanh()
                + "Thang phat hanh: "+quanLyTC.getThangPhatHanh());
    }
    
    public void TimKiem(){
        //Cai nay em quen roi
    }
}
