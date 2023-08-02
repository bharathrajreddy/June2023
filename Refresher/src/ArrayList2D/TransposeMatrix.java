package ArrayList2D;

import java.util.ArrayList;
import java.util.Arrays;

public class TransposeMatrix {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        int M = A.size();
        int N = A.get(0).size();
        for(int i=0; i<N; i++){
            ArrayList<Integer> al = new ArrayList<>();
            for(int j=0; j<M; j++){
                al.add((A.get(j).get(i)));
            }
            B.add(al);
        }
        return B;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();

        ArrayList a1 = new ArrayList<>(Arrays.asList(21,62,16,44,55,100,16,86,29));
        ArrayList a2 = new ArrayList<>(Arrays.asList(62,72,85,35,14,1,89,15,73));
        ArrayList a3 = new ArrayList<>(Arrays.asList(42,44,30,56,25,52,61,23,54));
        ArrayList a4 = new ArrayList<>(Arrays.asList(5,35,12,35,55,74,50,50,80));
        ArrayList a5 = new ArrayList<>(Arrays.asList(2,65,65,82,26,36,66,60,1));
        ArrayList a6 = new ArrayList<>(Arrays.asList(18,1,16,91,42,11,72,97,35));
        ArrayList a7 = new ArrayList<>(Arrays.asList(23,57,9,28,13,44,40,47,98));
//        ArrayList a8 = new ArrayList<>(Arrays.asList());
//        ArrayList a9 = new ArrayList<>(Arrays.asList());
        A.add(a1);
        A.add(a2);
        A.add(a3);
        A.add(a4);
        A.add(a5);
        A.add(a6);
        A.add(a7);
//        A.add(a8);
//        A.add(a9);


        System.out.println(solve(A));

    }
}
