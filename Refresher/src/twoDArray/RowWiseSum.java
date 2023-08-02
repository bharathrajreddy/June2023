package twoDArray;

import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][M];
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {
                A[row][col] = sc.nextInt();
            }
        }
        int[] B = new int[N];
        int sum = 0;
        for (int row = 0; row < N; row++) {
            sum =0;
            for (int col = 0; col < M; col++) {
                sum = sum + A[row][col];
            }
            B[row] = sum;
        }
        for(int x: B){
            System.out.print(x+" ");
        }
    }
}
