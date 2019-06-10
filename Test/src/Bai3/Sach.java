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
public class Sach extends TaiLieu{
    int soTrang;
    String tenTacGia;

    public Sach(String tenTacGia, int soTrang, String maTaiLieu, String tenNXB, int soBanPH) {
        super(maTaiLieu, tenNXB, soBanPH);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    Sach() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
}
