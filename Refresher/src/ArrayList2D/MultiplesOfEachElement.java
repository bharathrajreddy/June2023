package ArrayList2D;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplesOfEachElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,5,9,3,8/*16,3,3,6,7,8,17,13,7*/));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(3,2/*10,9,18*/));
        System.out.println(solve(A,B));
    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        int m = A.size();//2,5,9,3,8        9,3
        int n = B.size();//3,2              2,8
        for(int i=0; i<n; i++){
            ArrayList<Integer> res = new ArrayList<>();
            for(int j=0;j<m;j++){
                if((A.get(j)%B.get(i))==0){
                    res.add(A.get(j));
                }
            }
            al.add(res);
        }
        return al;
    }
}
