/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bai3;
/**
 *
 * @author ZzZ
 */
public class TaiLieu {
    String maTaiLieu;
    String tenNXB;
    int soBanPH;

    public TaiLieu(String maTaiLieu, String tenNXB, int soBanPH) {
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPH = soBanPH;
    }

    TaiLieu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBanPH() {
        return soBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        this.soBanPH = soBanPH;
    }
    
}
