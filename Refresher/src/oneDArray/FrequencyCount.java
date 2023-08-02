package oneDArray;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyCount {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
//        int count=0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<A.size();i++){//{1, 2, 5, 1, 5, 1}
            int count =0;                //{3, 1, 2, 3, 1, 3}
            for(int j=0; j<A.size(); j++){
                if(A.get(i).equals(A.get(j))){
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(2); arr.add(5); arr.add(1); arr.add(5); arr.add(1);
                        //{1, 2, 5, 1, 5, 1}
                        //{3, 1, 2, 3, 1, 3}
                        //{3, 1, 2, 3, 2, 3} exp op
        System.out.println(solve(arr));
    }

}
