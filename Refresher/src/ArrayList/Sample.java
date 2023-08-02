package ArrayList;

import java.util.*;

public class Sample {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            if(res.containsKey(A.get(i))){
                res.put(A.get(i), res.get(i));
            }else{
                res.put(A.get(i), 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<B.size(); i++){
            if(res.containsKey(B.get(i))){
                ans.add(res.get(B.get(i)));
            }
        }
//        ArrayList<Integer> res = new ArrayList<>();
//        for(int i=0; i<B.size(); i++){
//            int counter =0;
//            for(int j=0;j<A.size(); j++){
//                if(B.get(i).equals(A.get(j))){
//                    counter++;
//                }
//            }
//            res.add(counter);
//        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,1,1));
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1,2));
        System.out.println(solve(A,B));
    }
}
