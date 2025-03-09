package OOPslide7;

import java.nio.channels.ClosedByInterruptException;

public class BT2 {
    public static void main(String[] args) {
   GiamDoc gd = new GiamDoc("Viet Anh",3000000,3.0,1000000,20000000);
   gd.inTTin();
   CanBoQuanLy cb = new CanBoQuanLy("Viet Em",5000000,4.0,20000000);
   cb.inTTin();
    }
}

interface QuanLy{
    double tinhHoaHong();
}

 class GiamDoc extends NhanVienn implements QuanLy{
    private double phuCap;
    private double loiNhuanCongTy;
    public GiamDoc(String tenNhanVien,double luongCoBan,double heSoLuong,double phuCap,double loiNhuanCongTy){
        super(tenNhanVien, luongCoBan,heSoLuong);
        this.phuCap = phuCap;
        this.loiNhuanCongTy = loiNhuanCongTy;
    }
    public double tinhHoaHong(){
        return loiNhuanCongTy*0.05;
    }

     public double tinhLuong() {
         return super.tinhLuong()+phuCap+tinhHoaHong();
     }
   public void inTTin(){
        super.inTTin();
        System.out.println("Phu Cap: " + phuCap);
        System.out.println("Hoa Hồng: " + tinhHoaHong());
        System.out.println("Tong luong: " + tinhLuong());
   }
 }

 class CanBoQuanLy extends NhanVienn implements QuanLy{
    private double loiNhuanCongTy;
    public CanBoQuanLy(String tenNhanVien,double luongCoBan,double heSoLuong,double loiNhuanCongTy){
        super(tenNhanVien,luongCoBan,heSoLuong);
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

     @Override
     public double tinhHoaHong() {
         return loiNhuanCongTy * 0.002;
     }
     public double tinhLuong(){
        return super.tinhLuong()+tinhHoaHong();
     }
     public void inTTin(){
        super.inTTin();
        System.out.println("Hoa Hong: " + tinhHoaHong());
        System.out.println("Tong Luong: " + tinhLuong());
     }
 }


