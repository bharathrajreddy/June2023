package oneDArray;

import java.util.ArrayList;

public class CheckArrayIsSorted {
    public static int solve(ArrayList<Integer> A) {
        int output =1;
        for(int i=0; i<A.size()-1; i++){
            if(A.get(i)>A.get(i+1)){
                output = 0;
                break;
            }
        }
        return output;
    }

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(2);
        System.out.println(solve(A));
    }
}
