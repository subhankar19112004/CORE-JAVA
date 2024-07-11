class base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class derived extends base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        //creating an object of base class
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());
        //creating an object of derived class
        derived d = new derived();
        d.setY(45);
        System.out.println(d.getY());
    }
}
