package ArrayList;

import java.util.ArrayList;

public class DivisibleBy5And7 {
    public static ArrayList<Integer> solve(ArrayList<Integer> arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.size(); i++){
            if((arr.get(i)%5==0)&& (arr.get(i)%7==0)){
                res.add(arr.get(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(23);
        arr.add(34);
        arr.add(35);
        arr.add(66);
        arr.add(70);

        System.out.println(solve(arr));
    }
}
