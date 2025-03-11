package OOPslide8;
import java.util.List;
import java.util.ArrayList;

public class BT4slide8 {
    public static void main(String[] args) {
     PhongBan siu = new PhongBan("CR7");
     NhanVienCoHuu nv1 = new NhanVienCoHuu("Tran Viet Anh",5000000,5.0);
     NhanVienHopDong nv2 = new NhanVienHopDong("Tran Viet Em",8000000);
     TruongPhong tp = new TruongPhong("Viet Anh",10000000,6.0,5000000,3);
     siu.themNV(nv1);
     siu.themNV(nv2);
     siu.themNV(tp);
     siu.inThongTin();
    }
}

abstract class NhanVien{
  protected  String tenNhanVien;
  public static final double LUONG_MAX = 50000000;
   public NhanVien(String tenNhanVien){
       this.tenNhanVien = tenNhanVien;
   }
   public abstract double tinhLuong();
   public void inThongTin(){
       System.out.println("Ten nhan vien: " + tenNhanVien);
       System.out.println("Luong: " + tinhLuong());
   }
}

class NhanVienCoHuu extends NhanVien{
  private double luongCoBan;
  private double heSoLuong;
  public NhanVienCoHuu(String tenNhanVien,double luongCoBan,double heSoLuong){
      super(tenNhanVien);
      this.luongCoBan = luongCoBan;
      this.heSoLuong = heSoLuong;
  }
   public double tinhLuong(){
      return luongCoBan * heSoLuong;
   }
   public boolean tangHeSoLuong(double x){
      if(heSoLuong+x > 10) return false;
      this.heSoLuong += x;
      return true;
   }
   public void inThongTin(){
      super.inThongTin();
      System.out.println("Luong co ban: " + luongCoBan);
      System.out.println("He so luong: " + heSoLuong);
   }
}

class NhanVienHopDong extends NhanVien{
  private double luongHopDong;
  public NhanVienHopDong(String tenNhanVien,double luongHopDong){
      super(tenNhanVien);
      this.luongHopDong = luongHopDong;
  }
  public double tinhLuong(){
      return luongHopDong;
  }
  public void inThongTin(){
      super.inThongTin();
      System.out.println("Luong hop dong: " + luongHopDong);
  }
}

class TruongPhong extends NhanVienCoHuu{
 private  double phuCap;
 private  int soNamDuongChuc;
 public TruongPhong(String tenNhanVien,double luongCoBan,double heSoLuong,double phuCap,int soNamDuongChuc){
     super(tenNhanVien,luongCoBan,heSoLuong);
     this.phuCap = phuCap;
     this.soNamDuongChuc = soNamDuongChuc;
 }
   public double tinhLuong(){
     return super.tinhLuong() + phuCap;
   }
    public void inThongTin(){
     super.inThongTin();
        System.out.println("Phu cap: " + phuCap);
        System.out.println("So nam duong chuc: " + soNamDuongChuc);
    }
}


class PhongBan{
   private String tenPhongBan;
   private List<NhanVien> dsnv;
    public PhongBan(String tenPhongBan){
        this.tenPhongBan = tenPhongBan;
        this.dsnv = new ArrayList<>();
    }
    public void themNV(NhanVien nv){
        dsnv.add(nv);
    }
    public void xoaNV(String tenNV){
        dsnv.removeIf(nv->nv.tenNhanVien.equals(tenNV));
    }
    public double tongLuong(){
        double sum = 0;
        for(NhanVien nv : dsnv)
            sum += nv.tinhLuong();
        return sum;
    }
    public void inThongTin(){
        System.out.println("Phong ban: " + tenPhongBan);
        System.out.println("So nhan vien: " + dsnv.size());
        System.out.println("Danh sach nhan vien: ");
        for(NhanVien nv: dsnv){
            nv.inThongTin();
            System.out.println();
        }
        System.out.println("Tong luong phong ban: " + tongLuong());
    }
}
