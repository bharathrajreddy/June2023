package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(7, 9, 2, 51));
        System.out.println(solve(al));
    }
    public static long solve(ArrayList<Integer> arr){
        long num = 1;
        for(int i=0; i<arr.size(); i++){
            num = num * arr.get(i);
        }
        return num;
    }
}
