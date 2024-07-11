public class changinganintegerinmethods {
    static void change(int a){
        a = 98; //this is for example this is not come in the x and y object and this will be ignored later
    }

    public static void main(String[] args) {
        int[] marks = {52,96,89,96,56,99};
        int x = 45;
        change(x);
        System.out.println("The value of x after running chage is :" +x);
    }
}
