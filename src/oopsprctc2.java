class cellphone{
    public void ring(){
        System.out.println("ringing....");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void callfriend(){
        System.out.println("calling Rishi....");
    }
}
public class oopsprctc2 {
    public static void main(String[] args) {
        cellphone realme = new cellphone();
        realme.callfriend();
        realme.vibrate();
        realme.ring();
    }
}
