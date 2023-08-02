package oneDArray;

import java.util.Scanner;

public class InsertElementInArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i=0; i<N; i++){
                A[i]= sc.nextInt();
            }
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int[] B = new int[N+1];

            for(int i=0; i<N+1; i++){
                if(i<X-1){
                    B[i] = A[i];
                }else if(i==X-1){
                    B[i] = Y;
                }else{
                    B[i] = A[i-1];
                }
            }
            for(int i=0; i<N+1; i++){
                System.out.print(B[i]+" ");
            }
        }
}
