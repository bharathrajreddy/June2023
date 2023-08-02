package HashSetAndHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReturnHasMapFromArray {
//    public static HashMap<Integer, Integer>freqCount(int[] arr){
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        int count;
//        for(int i=0; i<arr.length; i++){
//            count=0;
//            for(int j=0; j<arr.length; j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            hm.put(arr[i], count);
//        }
//        return hm;
//    }
    public static HashMap<Integer, Integer>freqCountApproach2(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            System.out.println(hm);

            if(hm.containsKey(arr[i])){
                int currentCount = hm.get(arr[i]);
                int incrementCount = currentCount+1;
                hm.put(arr[i], incrementCount);
            }else{
                hm.put(arr[i], 1);
            }
        }
        return hm;
    }

    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<A.size(); i++){
            if(hm.containsKey(A.get(i))){
                int currentCount =hm.get(A.get(i));
                int incrementCount = currentCount+1;
                hm.put(A.get(i), incrementCount);
            }else{
                hm.put(A.get(i), 1);
            }
        }
        int count =0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue() == 1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,1,2,4,5,3,2,4,2};
        System.out.println(freqCountApproach2(arr));
    }
}
