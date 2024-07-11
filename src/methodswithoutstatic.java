public class methodswithoutstatic {
    int logic(int x,int y){
        int z;
        if(x>y)
        {
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        methodswithoutstatic obj = new methodswithoutstatic();
        int a = 5;
        int b = 7;
        int c;
        c = obj.logic(a,b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = obj.logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
