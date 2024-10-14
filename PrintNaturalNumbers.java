package WhileLoop;

import java.util.Scanner;

public class PrintNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int no = sc.nextInt();
        int i = 0;
        while (i<no) {
            i++;
            System.out.println(i);
        }
    }
}