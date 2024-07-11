class base1{
    base1(){
        System.out.println("I am a Constructor");
    }
    base1 (int X){
        System.out.println("I am a overload constructor with the value of X as : "+X);
    }
   /* public int X;
    public int getX(){
        return X;
    }
    public void setX(int X){
        this.X = X;
    }*/
}
class derived1 extends base1{
    derived1() {
        System.out.println("I am a derived Constructor");
    }
    derived1(int X,int Y){
        super(X);
        System.out.println("I am a overloaded constructor of derived with value of Y as: "+Y);
    }
      /*  public int Y;
        public int getY(){
            return Y;
    }

    public void setY(int y) {
        this.Y = Y;
    }*/
}
class childofderived1 extends derived1{
    childofderived1(){
        System.out.println("I am a child of derived constructor");
    }
    childofderived1(int X,int Y,int Z){
        super(X,Y);
        System.out.println("I am an overloaded constructor of derived with value of Z as : "+Z);
    }
}
public class constinheritance {
    public static void main(String[] args) {
    //    base1 b = new base1();
        derived1 d = new derived1(14,19);
        childofderived1 cd = new childofderived1(12,45,69);
    }
}
