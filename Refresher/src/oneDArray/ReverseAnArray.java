package oneDArray;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] A = {3,5,3,2,9,3,10,10,10,3};
        System.out.println(revArray(A));
    }
    public static int[] revArray(int[] A){
        int N = A.length;
        int temp=0;
        for(int i=0; i<N/2; i++){
            temp = A[i];
            A[i] = A[N-i-1];
            A[N-i-1] = temp;
        }
        return A;
    }
}
