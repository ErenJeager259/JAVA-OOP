package OOPslide4;
class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public static final double LUONG_MAX = 50000000;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
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
}
public class BT2slide4{
    public static void main(String[] args) {
        NhanVien S1 = new NhanVien("Tran Viet Anh", 5000000, 2.0);
        NhanVien S2 = new NhanVien("Tran Viet Em", 5000000, 2.5);
        System.out.println("Thông tin nhân viên 1:");
        S1.inTTin();
        System.out.println("Thông tin nhân viên 2:");
        S2.inTTin();
        System.out.println("Tăng lương cho nhân viên 1");
        if (S1.tangLuong(2)) {
            System.out.println("Tăng lương thành công");
        } else {
            System.out.println("Tăng lương thất bại");
        }
        S1.inTTin();
    }
}
