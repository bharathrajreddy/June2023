package oneDArray;

import java.util.ArrayList;

public class ProductOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(7);
        al.add(9);
        al.add(2);
        al.add(51);
        System.out.println(solve(al));
    }
    public static long solve(ArrayList<Integer> arr) {
        long product =1;
        for(int i=0; i<arr.size();i++){
            product = product*arr.get(i);
        }
        return product;
    }
}
