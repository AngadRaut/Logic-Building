package WhileLoop;

import java.util.Scanner;

public class DivisibleByMandN {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the limit");
        int No=obj.nextInt();
        System.out.println("Ener the two numbers you want to find numbers divisible by them from given range");
        int M=obj.nextInt();
        int N= obj.nextInt();

        for (int i=0;i<=No;i++){
            if(i%M==0 && i%N==0 ){
                System.out.println(i);
            }
        }
    }
}
