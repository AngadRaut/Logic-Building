package WhileLoop;

import java.util.Scanner;

public class DivisibleByN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int j = sc.nextInt();
        System.out.println("Enter the no whose divisible series you want");
        int k= sc.nextInt();

        for (int i=0;i<=j;i++){
            if(i%k==0){
                System.out.println(i);
            }
        }
    }
}
