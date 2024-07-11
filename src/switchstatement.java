import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit name : ");
        String fruit = in.next();
        switch (fruit){
            case "mango":
                System.out.println("it comes on summer");
                break;
            case "apple":
                System.out.println("it is sweet red fruit");
                break;
            case"orange":
                System.out.println("it's like the shape of earth ");
                break;
            case"grapes":
                System.out.println("it is black in colour");
                break;
            default:
                System.out.println("please enter a valid fruit name");
        }
    }
}
