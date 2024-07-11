class Employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("my id is " +id);
        System.out.println("And my name is" +name);
    }

    public int getSalary() {
        return salary;
    }
}
public class custom2 {
    public static void main(String[] args) {
        Employee harry = new Employee();
        Employee john = new Employee();
        harry.id = 12;
        harry.name = " subhankar";
        harry.salary = 90;

        john.id = 18;
        john.name = " Chandan";
        john.salary = 69;

        harry.printdetails();
        john.printdetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}
