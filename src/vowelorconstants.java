import java.util.Scanner;
public class vowelorconstants {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character");
        char ch = input.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("yes it is a vowel");
        }
        else{
            System.out.println("it is a constant");
        }
    }
}
