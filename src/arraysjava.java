import java.util.Scanner;
public class arraysjava {
    public static void main(String[] args) {
        int size,i;
        Scanner r = new Scanner(System.in);
        System.out.print("enter the size of the array");
        size = r.nextInt();
        int a[] = new int[size];
        for(i = 0;i<size;i++){
            a[i] = r.nextInt();
        }
        System.out.print("printrd array elements");
        for(i = 0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}
