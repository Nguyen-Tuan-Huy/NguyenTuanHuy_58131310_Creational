/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author zasx1
 */
public class CTHD {
    String SanPham;
    int SoLuong, DonGia;
    float ChietKhau;

    public CTHD(Builder b) {
        this.SanPham = b.SanPham;
        this.SoLuong = b.SoLuong;
        this.DonGia = b.DonGia;
        this.ChietKhau = b.ChietKhau;
    }
    
    public static class Builder{
        String SanPham;
        int SoLuong, DonGia;
        float ChietKhau;
        
        public Builder addSanPham(){
            this.SanPham = SanPham;
            return this;
        }
        
        public Builder addSoLuong(){
            this.SoLuong = SoLuong;
            return this;
        }
        public Builder addDonGia(){
            this.DonGia = DonGia;
            return this;
        }
        public Builder addChietKhau(){
            this.ChietKhau = ChietKhau;
            return this;
        }
        
        public CTHD build(){
            return new CTHD(this);
        }
    }
}
