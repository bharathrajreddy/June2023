package twoDArray;
import java.lang.*;
import java.util.*;

public class Solution {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] mat = new int[N][M];
            int[][] col_mat = new int[M][N];
            for(int i = 0; i < N; i++)
            {
                for(int j = 0; j < M; j++)
                {
                    mat[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < M; i++)
            {
                for(int j = 0; j < N; j++)
                {
                    col_mat[i][j] = mat[j][i];
                    System.out.print(col_mat[i][j] + " ");
                }
                System.out.println();
            }
        }
}
