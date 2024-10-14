package core_java;

public class SecondMax {
    public static void main(String[] args) {
        int[] ar = {99,1,2,3,4,5,6,77,54,22,55,677};
        int max = ar[1];
        int secondMax=0;
        for(int i = 0 ; i <ar.length ;i++){
            if(ar[i]>max ){

                secondMax = ar[i];
                max = ar[i];
            }
        }
        System.out.println(secondMax);
    }
}
