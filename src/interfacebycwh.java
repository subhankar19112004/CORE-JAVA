interface Bicycle{
    int a = 45;
    void applybrake(int decrement);
    void speedup(int increment);
}
interface Hornbicycle{
    void blowhorn3g();
    void blowhornmhn();
}
class Avoncycle implements Bicycle,Hornbicycle{
    void blowhorn(){
        System.out.println("pe pe pe");
    }
    public void applybrake(int decrement){
        System.out.println("Applying brake");
    }

    @Override
    public void speedup(int increment) {
        
    }

    @Override
    public void blowhorn3g() {

    }

    @Override
    public void blowhornmhn() {

    }
}
public class interfacebycwh {
    public static void main(String[] args) {
        Avoncycle cycleharry = new Avoncycle();
        cycleharry.applybrake(1);
        //you can create properties in inherirance
        System.out.println(cycleharry.a);
        //you cannot modify the properties in interfaces as they are final
        cycleharry.blowhorn3g();
        cycleharry.blowhornmhn();
    }
}
