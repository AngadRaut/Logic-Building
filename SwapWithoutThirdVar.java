package core_java;

public class SwapWithoutThirdVar {
    public static void main(String[] args) {

        // swap without third variable
        int a =10 ;
        int b = 20 ;
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println("b = "+b+" and a = "+ a );

        // swap using third var
        int p = 100;
        int q = 200 ;
        int temp = p ;
        p = q ;
        q = temp ;
        System.out.println("p = "+ p + " q = "+ q );



    }
}
