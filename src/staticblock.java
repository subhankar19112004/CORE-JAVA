public class staticblock {
    static int x;
    static{
        x += 5;
        System.out.print("i am in class block\n");
    }
    public static void main(String[] args) {
        System.out.println("i am in main block\n");
        System.out.print(x);
    }
    static{
        x += 10;
        System.out.print("i am in class block 2\n");
    }
}
