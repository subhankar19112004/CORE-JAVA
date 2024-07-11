public class practice1 {
    public static void main(String[]args){
        float [] marks = {96.3f,99.9f,91.2f,89.9f,98.8f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("the total average value is " + sum/marks.length);
    }
}
