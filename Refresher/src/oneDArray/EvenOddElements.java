package oneDArray;

import java.util.Scanner;

public class EvenOddElements {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int a=0; a<T; a++){
                int evenSum = 0;
                int oddSum = 0;
                int diff = 0;
                int N = sc.nextInt();
                int[] A = new int[N];
                for(int i=0; i<N; i++){
                    A[i]= sc.nextInt();
                }
                for(int j=0;j<N; j++){
                    if(A[j]%2==0){
                        evenSum += A[j];
                    }else{
                        oddSum += A[j];
                    }
                }
                diff = Math.abs(evenSum-oddSum);
                System.out.println(diff);
            }
        }
}
