package OOPslide8;

public class BT3slide8 {
    public static void main(String[] args) {
        //  System.out.println("11/12/2022");
        HangDienMay dm = new HangDienMay(1,"Tu lanh","Panasonic",20000000,2,50,60);
        HangSanhSu ss = new HangSanhSu(2,"Binh Gom","Gom Bat Trang",500000,"Gom");
        HangThucPham tp = new HangThucPham(3,"Banh chocopie","Chocopie VN",50000,"8/3/2025","8/3/2027");
        System.out.println("Hang Dien May ");
        dm.inThongTin();
        System.out.println("Hang Sanh Su ");
        ss.inThongTin();
        System.out.println("Hang Thuc Pham ");
        tp.inThongTin();
    }
}

class Hang{
    protected int maHang;
    protected String tenHang;
    protected String nhaSanXuat;
    protected double gia;
    public Hang(int maHang,String tenHang,String nhaSanXuat,double gia){
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
    }
     public void inThongTin(){
         System.out.println("Ma hang: " + maHang);
         System.out.println("Ten hang: " + tenHang);
         System.out.println("Nha san xuat: " + nhaSanXuat);
         System.out.println("Gia: " + gia);
     }
}

class HangDienMay extends Hang {
    private int thoiGianBaoHanh;
    private double dienAp;
    private double congSuat;
    public HangDienMay(int maHang,String tenHang,String nhaSanXuat,double gia,int thoiGianBaoHanh,double dienAp,double congSUat){
        super(maHang, tenHang, nhaSanXuat, gia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSUat;
    }
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh + " năm");
        System.out.println("Dien ap: " + dienAp + " V");
        System.out.println("Cong suat: " + congSuat + " W");
        System.out.println();
    }
}

class HangSanhSu extends  Hang {
    private String loaiNguyenLieu;
    public HangSanhSu(int maHang,String tenHang,String nhaSanXuat,double gia,String loaiNguyenLieu){
        super(maHang, tenHang, nhaSanXuat, gia);
        this.loaiNguyenLieu = loaiNguyenLieu;
    }
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Loai nguyen lieu: " + loaiNguyenLieu);
        System.out.println();
    }
}

class HangThucPham extends Hang{
    private String ngaySanXuat;
    private String ngayHetHan;
    public HangThucPham(int maHang,String tenHang,String nhaSanXuat,double gia,String ngaySanXuat,String ngayHetHan){
        super(maHang, tenHang, nhaSanXuat, gia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Ngay san xuat: " + ngaySanXuat);
        System.out.println("Ngay het han: " + ngayHetHan);
        System.out.println();
    }
}

