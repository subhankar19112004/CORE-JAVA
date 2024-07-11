import java.util.Scanner;
public class alphabets {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter the character:");
        char ch = input.next().charAt(0);
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            System.out.println("This is alphabet");
        }
        else{
            System.out.println("This is not a alphabet");
        }
    }
}
