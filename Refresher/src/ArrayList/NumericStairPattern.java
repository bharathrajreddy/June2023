package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class NumericStairPattern {
    public static ArrayList<ArrayList<Integer>> solve1(int A) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<A; i++){
            for(int j=0; j<i; j++){
                al.get(i).set(j,j+1);
            }
        }
        return al;
    }

    public static int solve(ArrayList<Integer> A) {
        int unique = 0;
        for(int x: A){
            int count =0;
            for(int y: A){
                if(x==y){
                    count++;
                }
            }
            if(count == 1){
                unique++;
            }
        }
        return unique;
    }
    public static void main(String[] args) {
       int A = 3;
       ArrayList<Integer> al = new ArrayList<>(Arrays.asList(3, 3, 3, 9, 0, 1, 0));
        System.out.println(solve(al));
    }
}
