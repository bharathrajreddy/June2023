package oneDArray;

import java.util.Arrays;

public class RewardStudents {
    public static void main(String[] args) {
        int[] A = {2,1,3,1,3};
        System.out.println(solve(A));
    }
    public static int solve(int[] A){
        Arrays.sort(A);
        int N = A.length;
        int sum = A[N-1]+A[N-2];

        return sum;
    }

}
