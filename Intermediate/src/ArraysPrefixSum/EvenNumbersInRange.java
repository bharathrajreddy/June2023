package ArraysPrefixSum;

public class EvenNumbersInRange {
    public static int[] solve(int[] A, int[][] B) {
        int oddEven[] = new int[A.length];
        int[] res = new int[B.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                oddEven[i] = 1;
            } else {
                oddEven[i] = 0;
            }
        }
//        for(int x: oddEven){
//            System.out.print(x+" ");
//        }
        int pSum[] = new int[A.length];
        pSum[0] = oddEven[0];
        for(int i=1; i<oddEven.length; i++){
            pSum[i] = pSum[i-1]+oddEven[i];
        }
//        for(int x: pSum){
//            System.out.print(x+" ");
//        }
        for(int i=0; i<B.length; i++){
            int L = B[i][0], R = B[i][1];
            if(L==0){
                res[i] = pSum[R];
            }else{
                res[i] = pSum[R]-pSum[L-1];
            }
        }
//        for(int x: res){
//            System.out.print(x+" ");
//        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}; // oddEven={0,1,0,1,0}
        int[][] B = {{0,2}, {2,4}, {1,4}};
        solve(arr, B);
    }
}
