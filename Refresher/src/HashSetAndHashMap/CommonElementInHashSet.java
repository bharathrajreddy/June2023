package HashSetAndHashMap;

import java.util.HashSet;

public class CommonElementInHashSet {
    public static void printIntersection(HashSet<Integer> hs1, HashSet<Integer> hs2){
        for (Integer x: hs1){
            if(hs2.contains(x)){
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,11,22,14,56,87};
        int[] arr2 = {11,56,14,98};
        HashSet<Integer> hs = ArrayToHashSet.convertArrayToHashSet(arr1);
        HashSet<Integer> hs1 = ArrayToHashSet.convertArrayToHashSet(arr2);

        printIntersection(hs, hs1);

    }
}
