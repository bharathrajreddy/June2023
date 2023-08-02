package ArrayList2D;

import java.util.ArrayList;

public class ArrayListStairCase {
    public static void main(String[] args) {
        System.out.println(stairCase(5));
    }

    public static ArrayList<ArrayList<Integer>> stairCase(int N){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int row=1; row<=N; row++){
            ArrayList<Integer> currAns = new ArrayList<>();
            for(int col=1; col<=row; col++){
                currAns.add(col);
            }
            ans.add(currAns);
        }
        return ans;
    }
}
