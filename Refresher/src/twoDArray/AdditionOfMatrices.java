package twoDArray;

public class AdditionOfMatrices {
    public static int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int[][] res = new int[n][m];
        for(int row=0; row<n; row++){
            for( int col=0; col<m; col++){
                res[row][col] = A[row][col]+B[row][col];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][]A = new int[3][3];
        int[][]B = new int[3][3];
        solve(A, B);
    }
}
