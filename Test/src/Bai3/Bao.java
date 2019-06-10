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
public class Bao extends TaiLieu {

    String ngayPhatHanh;

    public Bao(String ngayPhatHanh, String maTaiLieu, String tenNXB, int soBanPH) {
        super(maTaiLieu, tenNXB, soBanPH);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    Bao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;

    }

}
