package core_java;

public class NoOfDigits {
    public static void main(String[] args) {
        int no = -3465;
        int dig = 0;

        if(no<0){
            no = no * -1 ;
        }
            while (no > 0) {
                no = no / 10;
                dig++;
            }
            System.out.println(dig);

    }
}
