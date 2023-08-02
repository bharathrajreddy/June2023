package ArraysPrefixSum;

public class RangeSumQueryPrefixSum {
    /* Given arr[n] elements and Q queries, for each query Given L & R.
    calculate and print sum of all elements in range [L R}.
    L & R both has to be included
    Note: L & R are array indices such that
                0<=L<=R<N
    Constraint: 1<= N, Q<= 10^5
                -10 <= A[i] <= 10^9
                0<=L<=R<N
    * */
    public static long[] solve(int[] A, int[][] B){
        long[] res = new long[B.length];
        long pSum[] = new long[A.length];
        pSum[0] = A[0];
        for(int i=1; i<A.length; i++){
            pSum[i] = pSum[i-1]+A[i];
        }
        for(int i=0; i<B.length; i++){
            int L = B[i][0], R = B[i][1];
            if(L==0){
                res[i] = pSum[R];
            }else{
                res[i] = pSum[R]-pSum[L-1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
        int queries = 5;
        int[][] B = {{4,8},{3,7},{1,3},{0,4},{7,7}};
        solve(arr, B);
    }
}
