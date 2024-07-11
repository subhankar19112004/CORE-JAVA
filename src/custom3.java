class Employee2{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("my regd.no is " +id);
        System.out.println("and my name is " + name + ".");
    }
}
public class custom3 {
    public static void main(String[] args) {
        Employee2 rishi = new Employee2();
        Employee2 papun = new Employee2();

        rishi.id = 176;
        rishi.name = "subhasish";
        rishi.salary = 45000;

        papun.id = 174;
        papun.name = "subhankar";
        papun.salary = 50000;

        rishi.printdetails();
        papun.printdetails();
    }
}
