package ArraysPrefixSum;

public class RangeSumQuery {
    /* Given arr[n] elements and Q queries, for each query Given L & R.
    calculate and print sum of all elements in range [L R}.
    L & R both has to be included
    Note: L & R are array indices such that
                0<=L<=R<N
    Constraint: 1<= N, Q<= 10^5
                -10 <= A[i] <= 10^9
                0<=L<=R<N
    * */
    public static int[] solve(int[] A, int Q, int[][] B){
        int N = A.length;
        int res[] = new int[B.length];
        int sum;
        for(int i=0; i<Q; i++){
            sum=0;
            int L = B[i][0];
            int R = B[i][1];
            for(int j=L; j<=R; j++){
                sum = sum +A[j];
            }
            res[i] = sum;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
        int queries = 5;
        int[][] B = {{4,8},{3,7},{1,3},{0,4},{7,7}};
        solve(arr, queries, B);

    }
}
