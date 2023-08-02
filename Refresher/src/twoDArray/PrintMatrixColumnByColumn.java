package twoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMatrixColumnByColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for(int row=0; row<N; row++){
            for(int col=0; col<M; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        int [] B = new int[arr.length];
        for(int row =0; row<arr.length; row++){
            int val = 0;
            for(int col=0; col<arr[row].length; col++){
                if(val<arr[row][col]){
                    B[row] = arr[row][col];
                }
                }
        }

    }
//    public static int[] solve(int[][] A) {
//        int [] B = new int[A.length];
//        for(int row =0; row<A.length; row++){
//            int val = 0;
//            for(int col=0; col<A[0].length; col++){
//                if(val<A[row][col]){
//                    val = A[row][col];
//                }
//                B[row] = val;
//            }
//            System.out.println();
//        }
//        return B;
//    }
}
