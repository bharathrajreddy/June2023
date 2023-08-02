package oneDArray;

import java.util.ArrayList;
import java.util.List;

public class CopyTheArray {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        int B= 5;
        System.out.println(solve(A, B));
    }
    public static ArrayList<Integer> solve(final List<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        for (Integer integer : A) {
            res.add(integer + B);
        }
//        for (int i=0; i<A.size(); i++) {
//            res.add(A.get(i) + B);
//        }
        return res;
    }
}
