package QLTT_Tien_Luong;

import java.util.List;

public class CBGV extends Nguoi{

    private int luong_cung;
    private int luong_thuong;
    private int tien_phat;
    private int luong_thuc_linh=luong_cung+luong_thuong-tien_phat;

    public int getLuong_cung() {
        return luong_cung;
    }

    public int getLuong_thuong() {
        return luong_thuong;
    }

    public int getTien_phat() {
        return tien_phat;
    }

    public int getLuong_thuc_linh() {
        return luong_thuc_linh;
    }

    public void setLuong_cung(int luong_cung) {
        this.luong_cung = luong_cung;
    }

    public void setLuong_thuong(int luong_thuong) {
        this.luong_thuong = luong_thuong;
    }

    public void setTien_phat(int tien_phat) {
        this.tien_phat = tien_phat;
    }

    public void setLuong_thuc_linh(int luong_thuc_linh) {
        this.luong_thuc_linh = luong_thuc_linh;
    }


}
