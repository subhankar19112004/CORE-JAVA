class Employee1{
    int id;
    String name;

}
public class custom1 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 harry = new Employee1();
        harry.id = 12;
        harry.name = "subhankar";

        System.out.println(harry.id);
        System.out.println(harry.name);
    }
}
