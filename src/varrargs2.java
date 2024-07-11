public class varrargs2 {
    static int sum(int x, int ...arr){
        int result = x;
        for(int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the den of coders");
        System.out.println("the sum of 1 is : " +sum(1));
        System.out.println("the sum of 4,3 and 5 is : " +sum(4,3,5));
        System.out.println("the sum of 4,4,3 and 5 is : " +sum(4,4,3,5));
    }
}
