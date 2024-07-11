import java.util.Scanner;
public class maximumbetweenthreenumbers {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number1");
        int num1 = input.nextInt();
        System.out.print("enter the number2");
        int num2 = input.nextInt();
        System.out.print("enter the number3");
        int num3 = input.nextInt();
        if(num1>num2 && num2>num3){
            System.out.println("maximum number is"+num1);
        }
        else if(num2>num1 && num3<num1){
            System.out.println("maximum number is"+num2);
        }
        else{
            System.out.println("maximum number is"+num3);
        }
    }
}
