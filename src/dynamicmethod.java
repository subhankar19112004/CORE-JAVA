import java.sql.SQLOutput;

class phone{
    public void showtime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on the phone.....");
    }

    public void music() {
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("playing music...");
    }
    public void on(){
        System.out.println("Turning on smartphone....");
    }
}
public class dynamicmethod {
    public static void main(String[] args) {
        phone obj1 = new phone();
        phone obj = new smartphone();
        obj1.on();
        obj.on();
        obj.music();
    }
}
