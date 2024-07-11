public class varrargs {
    static int sum(int ...arr){
        int result = 0;
        for(int a :arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the varrarrgs tutorial");
        System.out.println("The sum of 4 and 5 is : " +sum(4,5));
        System.out.println("The sum of 4,3,5 is : " +sum(4,3,5));
        System.out.println("The sum of 2,4,3,5 is : " +sum(2,4,3,5));

    }
}
