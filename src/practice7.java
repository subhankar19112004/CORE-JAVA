import java.util.Scanner;
public class practice7  {
    public static void main(String[] args) {
       int a[] = new int[5]; int sum = 0; double avg;
       Scanner r = new Scanner(System.in);
       System.out.print("enter Array elements");
       for(int i = 0;i<5;i++)
       {
           a[i] = r.nextInt();
       }
       System.out.print("Array Elements");
       for(int i = 0;i<5;i++)
       {
           System.out.print(a[i]+ " ");
       }
       for(int i = 0;i<5;i++)
       {
           sum = a[i]+sum;
       }
       avg = sum/5.0;
       System.out.print("\nAddition"+sum+ "\n Average " +avg);
    }
}
