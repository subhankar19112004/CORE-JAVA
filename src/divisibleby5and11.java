import java.util.Scanner;
public class divisibleby5and11 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number");
        int num = input.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("the number is divisible by 5 and 11");
        }
        else{
            System.out.println("the number is not divisible by 5 and 11");
        }
    }
}
