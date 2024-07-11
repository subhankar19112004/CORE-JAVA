public class pract1 {
    public static void main(String[] args) {
        double nums[] = {96.5,93.2,96.9,94.99,99.9};
        double result = 0;
        int i;
        for(i=0;i<5;i++)
            result = result+nums[i];
            System.out.println("Average is " + result/5);
    }
}
