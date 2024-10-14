package core_java;


interface A{
    void add();
}
public class Pattern {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 4 ;i++ ){
            for(int j = 0 ; j <= i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        A a = () -> System.out.println("a");
        a.add();
    }
}
