
import java.util.Scanner;
import java.util.Random; 
class game{
    public int number;
    public int inputnumber;
    public int noofguesses =0;

    public int getNoofguesses() {
        return noofguesses;
    }

    public void setNoofguesses(int noofguesses) {
        this.noofguesses = noofguesses;
    }
     game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    boolean iscorrectnumber() {
        noofguesses++;
        if (inputnumber == number) {
            System.out.format("YES!! you guessed it right,it was %d\n you guessed it in %d attempts", number, noofguesses);
            return true;
        }

         else if(inputnumber<number){
            System.out.println("Too low...");
        }
         else if (inputnumber>number) {
            System.out.println("Too high....");
        }
        return false;
    }
}
public class gemfrslctrndmnmbr {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b){
            g.takeuserinput();
            b = g.iscorrectnumber();

        }    }
}
