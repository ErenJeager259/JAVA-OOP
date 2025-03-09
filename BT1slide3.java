package OOPslide3;
class Square {
    double canh;

    public Square(double canh){
        this.canh = canh;
    }
    public double dientich(){
        return canh*canh;
    }
    public double chuvi(){
        return canh*4;
    }
}
 class Circle {
    double bankinh;
    public Circle(double bankinh){
        this.bankinh = bankinh;
    }
    public double dientich(){
        return bankinh*bankinh*3.14;
    }
    public double chuvi(){
        return 2*bankinh*3.14;
    }
}
public class BT1slide3{
    public static void main(String[] args) {

    }
}
