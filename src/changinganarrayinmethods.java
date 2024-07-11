public class changinganarrayinmethods {
    static void change2(int[]arr){
        arr[0] = 98; // here after running the change will be there to 98 because the both arr and marks refers to the same numbers
    }

    public static void main(String[] args) {
        int[]marks = {100,98,96,99,93,89};
        change2(marks);
        System.out.println("The value of x after running change is : " + marks[0]);
    }
}
