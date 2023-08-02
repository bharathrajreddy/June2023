package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RowsAndColumnsSum {

    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> arr = new ArrayList<>();
        int sum;
        for(int row=0; row<A.size(); row++){
            sum = 0;
            for(int col=0; col<A.get(0).size();col++){
                sum = sum + A.get(row).get(col);
            }
            arr.add(sum);
        }

        for(int col=0; col<A.get(0).size();col++){
            sum = 0;
            for(int row=0; row<A.size(); row++){
                sum = sum + A.get(row).get(col);
            }
            arr.add(sum);
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(8,9));
        A.add(list);
        A.add(list2);
        A.add(list3);
        System.out.println(A);
        System.out.println(solve(A));
    }
}
