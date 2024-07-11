class employee{
    int salary;
    String name;
public int getSalary(){
    return salary;
}

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
public class oopsprctc1 {
    public static void main(String[] args) {
        employee harry = new employee();
        harry.salary = 233;
        harry.setName  ("papun");
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
    }
}
