public class practice3 {
    public static void main(String[] args) {
        float[] marks = {45.2f, 23.5f, 236.5f, 36.2f};
        float num = 236.5f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in array");
        }
        else{
            System.out.println("The value is not present in array");
        }
    }
}




