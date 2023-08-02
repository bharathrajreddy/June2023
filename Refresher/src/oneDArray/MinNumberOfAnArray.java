package oneDArray;

import java.util.Scanner;

public class MinNumberOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int minNumber = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            A[i]= sc.nextInt();
        }
        for(int i=0; i<N; i++){
           if(minNumber>= A[i]){
               minNumber = A[i];
           }
        }
        System.out.println(minNumber);
    }
}
