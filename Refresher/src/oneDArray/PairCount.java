package oneDArray;

import java.util.ArrayList;

public class PairCount {
    public static int solve(ArrayList<Integer> A, int B ) {
        int count =0;
        for(int i=0; i<A.size()-1;i++){
            for(int j=i+1; j<A.size()-1;  j++){
                if(A.get(i) + A.get(j) ==B){
                    count++;
                }
            }
//            int[] Ar = new int[5];
//            int n = Ar.length;
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(2); arr.add(3); arr.add(2); arr.add(1);
//        arr.add(1); arr.add(1); arr.add(1);

        System.out.println(solve(arr,5));
    }

}
