public class nonstaticblock {
    int data;
    nonstaticblock(){
        data++;
        System.out.println("objects is constructed");
    }
    void increment() {
        data++;
        System.out.println("i am in object method");
    }
    {
        data += 5;
        System.out.print("first object block");
    }

    {
        data += 10;
        System.out.println("second object block");
    }

    public static void main(String[] args) {
         nonstaticblock ab = new nonstaticblock();
        System.out.println("Data value for first object : " +ab);
        nonstaticblock aa = new nonstaticblock();
        aa.increment();
        System.out.println("data value for second object is : " + aa.data);
    }
}



