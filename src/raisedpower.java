public class raisedpower {
    public static void main(String[]args){
        int base = 7,  exponent = 5;
        long result = 1;
        while(exponent != 0){
            result*=base;
            --exponent;
        }
        System.out.println("Answer =" +result);
    }
}
