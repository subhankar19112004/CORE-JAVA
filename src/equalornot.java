import java.util.Scanner;
public class equalornot {
    public static void main(String[] args){
        int m,n;
        Scanner s = new Scanner(System.in);
        System.out.print("enter the first number");
        m = s.nextInt();
        System.out.print("enter the second number");
        n = s.nextInt();
        if(m==n)
        {
            System.out.println(m+"and"+n+" are equal");
        }
        else {
            System.out.println(m+"and"+n+"are not equal");
        }
    }

}
