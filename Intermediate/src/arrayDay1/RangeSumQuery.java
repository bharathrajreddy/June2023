package arrayDay1;

public class RangeSumQuery {
    public static void main(String[] args) {
        int[] A = {6,3,3,6};
        int[][] B = {{0,3},{0,2}};
        solve(A, B);
    }
    public static int[] solve(int[] A, int[][] B) {
        int[] C = new int[B.length];
        for(int i=0; i<=B.length-1; i++){
            for(int j= B[i][0]; j<=B[i][1]; j++){
                C[i] += A[j];
            }
        }
        return C;
    }
}
