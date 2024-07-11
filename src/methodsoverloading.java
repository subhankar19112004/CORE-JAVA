public class methodsoverloading {
    static void foo (){
        System.out.println("GOOD MORNING BRO!");
    }
    static void foo(int a){
        System.out.println("GOOD MORNING " + a + "BRO!" );
    }
    static void foo(int a, int b){
        System.out.println("GOOD MORNING " + a + "BRO!" );
        System.out.println("GOOD MORNING " + b + "BRO!" );
    }

    public static void main(String[] args) {
        methodsoverloading o = new methodsoverloading();
        o.foo();
        o.foo(3000);
        o.foo(3000,4000);
    }
}