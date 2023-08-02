package twoDArray;

import java.util.Scanner;

public class PrintElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][M];
        for(int row=0; row<N; row++){
            for(int col=0; col<M; col++){
                A[row][col] = sc.nextInt();
            }
        }
        printRowByRow(A);
    }

    public static void printRowByRow(int[][] matrix){
        int N = matrix.length;//row size
        int M = matrix[0].length;//col size
        for(int row=0; row<=N; row++){
            for(int col=0; col<M; col++){
                System.out.println(matrix[row][col]+" ");
            }
        }
    }

    public static void printSumOfArray(int[][] matrix){
        int N = matrix.length;//row size
        int M = matrix[0].length;//col size
        int sum =0;
        for(int row=0; row<=N; row++){
            for(int col=0; col<M; col++){
                sum += matrix[row][col];

            }
        }
        System.out.println(sum);
    }
}
