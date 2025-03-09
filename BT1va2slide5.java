package OOPslide5;

class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public static final double LUONG_MAX = 50000000;
    private static int soluongNhanVien = 0;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
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
        System.out.printf("Lương: %.2f\n", tinhLuong());
    }

    public static int getsoluongNhanVien() {
        return soluongNhanVien;
    }

    public static double tongLuong(NhanVien[] dsnv) {
        double sum = 0;
        for (NhanVien i : dsnv) {
            sum += i.tinhLuong();
        }
        return sum;
    }
}
public class BT1va2slide5 {
    public static void main(String[] args) {
        NhanVien S1 = new NhanVien("Tran Viet Anh", 5000000, 2.0);
        NhanVien S2 = new NhanVien("Tran Viet Em", 5000000, 2.5);
        System.out.println("Thông tin nhân viên 1:");
        S1.inTTin();
        System.out.println("Thông tin nhân viên 2:");
        S2.inTTin();
        int soluong = NhanVien.getsoluongNhanVien();
        System.out.println("Số lượng nhân viên hiện tại " + soluong);

        NhanVien[] dsnhanvienbatky = {S1,S2};
        double sum = NhanVien.tongLuong(dsnhanvienbatky);
        System.out.printf("Tổng lương các nhân viên này %.2f\n" , sum);
    }
}
