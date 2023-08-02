package HashSetAndHashMap;

import java.util.HashSet;

public class ArrayToHashSet {
    public static HashSet<Integer> convertArrayToHashSet(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int x: arr){
            hs.add(x);
        }
        return hs;
    }
    //        Approach 1
//        for(int i=0; i<arr.length; i++){
//            hs.add(arr[i]);
//        }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,-6,-7};
        System.out.println(convertArrayToHashSet(arr));
    }
}
