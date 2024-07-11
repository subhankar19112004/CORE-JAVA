public class subhankar {
    public static void main(String[]args){
        int [] marks = {10,20,30,40,50};
        System.out.println(marks.length);
        System.out.println(marks[2]);
        System.out.println("printing using for loop");
        for(int i = 0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for loop but in reverse ");
        for(int i = marks.length - 1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("printing using for-each loop loop");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
