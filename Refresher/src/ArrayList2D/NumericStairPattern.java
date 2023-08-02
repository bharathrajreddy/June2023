package ArrayList2D;

import java.util.ArrayList;

public class NumericStairPattern {
    public static void main(String[] args) {
        int A = 9;
        System.out.println(solve(A));
    }
    public static ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        for(int i=1; i<=A; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=1; j<=i; j++){
//                arr.set(j-1, j);
                arr.add(j);
            }
            al.add(arr);
        }
        return al;
    }
}
