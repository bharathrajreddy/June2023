package twoDArray;

import java.util.Scanner;
// Wave form means alternate rows should be printed in reverse order
public class WaveForm {
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
            for(int row =0; row<N; row++){
                for(int col=0; col<M; col++){
                    if(row%2 != 0){
                        for(int rev =M; rev>0; rev--){
                            System.out.print(A[row][rev]+" ");
                        }
                    }else{
                        System.out.print(A[row][col]+" ");
                    }
                    System.out.println();
                }
            }
    }

}
