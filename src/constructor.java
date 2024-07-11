public class constructor {
    public static void main(String[] args) {
        float[] marks = {45.5f, 56.2f, 56.2f, 23.5f, 100f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);
    }
}