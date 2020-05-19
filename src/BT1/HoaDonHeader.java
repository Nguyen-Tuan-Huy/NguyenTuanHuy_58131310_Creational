package BT1;

import java.util.ArrayList;

public class HoaDonHeader {
    String MaHD, NgayBan, TenKH;    
    
    public HoaDonHeader(Builder b){
        this.MaHD = b.MaHD;
        this.NgayBan = b.NgayBan;
        this.TenKH = b.TenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "MaHD=" + MaHD + ", NgayBan=" + NgayBan + ", TenKH=" + TenKH + '}';
    }
    
    public static class Builder{
        String MaHD, NgayBan, TenKH;

        public Builder() {
        }
        
        public Builder addMaHD(){
            this.MaHD = MaHD;
            return this;
        }
        
        public Builder addNgayBan(){
            this.NgayBan = NgayBan;
            return this;
        }
        public Builder addTenKH(){
            this.TenKH = TenKH;
            return this;
        }
        public HoaDonHeader build()
        {
            return new HoaDonHeader(this);
        }
    }
}
