package twoDArray;

import java.util.Scanner;

public class DeleteElement {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i=0; i<N; i++){
                A[i]= sc.nextInt();
            }
            int X = sc.nextInt();

            for(int i=X; i<=N-1; i++){
                A[i-1] = A[i];
            }
            for(int i=0; i<N-1; i++){
                System.out.print(A[i]+" ");
            }
        }
}
