import java.util.Scanner;
public class peremeterofatriangle {
    public static void main(String[]args){
        int num1 , num2 ,num3, peremeter;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the first side");
        num1 = s.nextInt();
        System.out.print("enter the second side");
        num2 = s.nextInt();
        System.out.print("enter the third side");
        num3 = s.nextInt();
        peremeter = num1 + num2 + num3 ;
        System.out.println("peremeter of a triangle:" +peremeter);

    }
}
