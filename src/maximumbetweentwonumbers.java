import java.util.Scanner;
public class maximumbetweentwonumbers {
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number1:");
    int num1 = input.nextInt();
    System.out.print("Enter the number2:");
    int num2 = input.nextInt();
    if(num1>num2){
        System.out.println("maximum number is" +num1);
    }
    else if(num1<num2){
        System.out.println("maximum nubmer is" +num2);
    }
    else{
        System.out.println("both numbers are equal" +num1);
    }
    }
}
