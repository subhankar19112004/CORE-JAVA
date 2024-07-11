import java.util.Scanner;
public class lengthandbreadthoftriangle {
    public static void main(String[]args){
        int num1 , num2 , peremeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the length");
         num1 = s.nextInt();
        System.out.print("enter the breadth");
         num2 = s.nextInt();
         peremeter = 2*(num1 + num2);
         System.out.println("peremeter of a triangle:" +peremeter);
         area = num1*num2;
         System.out.println("area of a triangle:" +area);
    }
}
