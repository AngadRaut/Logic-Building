package core_java;


public class Factorial {
    static int fact = 1  ;
    public static void main(String[] args) {

        int no = 6 ;
/*        for(int i = no ; i >= 1 ;i--){
             fact = fact * i ;
        }
        System.out.println(fact);*/

        System.out.println();
        for (int i = 1 ; i<= no ; i++){
            fact = fact * i ;
        }
        System.out.println(fact);
    }
}
