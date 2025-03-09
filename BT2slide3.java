package OOPslide3;
class Vector
{
    double x,y,z;
    public Vector(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector cong(Vector v){
        return new Vector(this.x+v.x,this.y+v.y,this.z+v.z);
    }
    public Vector tru(Vector v){
        return new Vector(this.x-v.x,this.y-v.y,this.z-v.z);
    }
    public Vector nhan(double cr7){
        return new Vector(this.x*cr7,this.y*cr7,this.z*cr7);
    }
    public double nhanvohuong(Vector v){
        return this.x*v.x + this.y*v.y + this.z*v.z;
    }
}
public class BT2slide3{
    public static void main(String[] args) {

    }
}
