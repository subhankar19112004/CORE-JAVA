class circle{
    public int radius;
    circle(){
        System.out.println("I am non param of circle");
    }
    circle (int r){
        System.out.println("vffyuh");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r,int h){
        super(r);
        System.out.println(" hvhjbv");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class prctcinherit {
    public static void main(String[] args) {
        cylinder obj = new cylinder(12,14);
    }
}
