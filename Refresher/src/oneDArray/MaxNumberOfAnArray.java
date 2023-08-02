package oneDArray;

import java.util.Scanner;

public class MaxNumberOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int maxNumber = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            A[i]= sc.nextInt();
        }
        for(int i=0; i<N; i++){
           if(maxNumber<= A[i]){
               maxNumber = A[i];
           }
        }
        System.out.println(maxNumber);
    }
}
