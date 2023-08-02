package ArrayList2D;

public class MatrixScalarProduct {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        int B;

    }
    public static int[][] solve(int[][] A, int B){
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                A[i][j] = B * A[i][j];
            }
        }
        return A;
    }
}
