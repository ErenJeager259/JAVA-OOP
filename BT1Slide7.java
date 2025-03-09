package OOPslide7;

public class BT1Slide7
{
    public static void main(String[] args) {
        TruongPhong siu = new TruongPhong("Ronaldo",5000000,4.0,2000000,5);
        siu.inTTin();
    }
}
class NhanVienn {
    protected String tenNhanVien;
    protected double luongCoBan;
    protected double heSoLuong;
    public static final double LUONG_MAX = 50000000;
    private static int soluongNhanVien = 0;
    public NhanVienn(String tenNhanVien,double luongCoBan,double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soluongNhanVien++;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public boolean tangLuong(double heSoTang) {
        if ((heSoLuong + heSoTang) * luongCoBan <= LUONG_MAX) {
            heSoLuong += heSoTang;
            return true;
        }
        return false;
    }

    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.printf("Lương: %.2f\n" , tinhLuong());
    }

}

class TruongPhong extends NhanVienn{
    private double phuCap;
    private double soNamDuongChuc;
    public TruongPhong(String tenNhanVien,double luongCoBan,double heSoLuong,double phuCap,double soNamDuongChuc){
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }
    public double tinhLuong() {
        return luongCoBan * heSoLuong + phuCap;
    }
    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Phụ Cấp:" + phuCap);
        System.out.println("Số năm đương chức " + soNamDuongChuc);
        System.out.printf("Lương: %.2f\n" , tinhLuong());
    }
}
