package arrayDay1;

public class SecondLargest {
    public static int solve(int[] A) {
        int n = A.length;
        int max = -1;
        int secMax = -1;
        for(int i=0; i<n; i++){
            if(A[i]==max){
                continue;
            }
            if(A[i]>max){
                secMax = max;
                max = A[i];
            } else if (A[i]>secMax) {
                secMax = A[i];
            }
        }
        return secMax;
//        The original array is [-2, 6, -3, 4, -3].
    }

    public static void main(String[] args) {
        int[] arr = {13,7,16,18,14,17,18,8,10};
        System.out.println(solve(arr));
    }
}
