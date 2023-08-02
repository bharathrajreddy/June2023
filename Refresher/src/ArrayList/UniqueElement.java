package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElement {
    public static int solve(ArrayList<Integer> A) {
        int unique = 0;
        for(int x: A){
            int count =0;
            for(int y: A){
                if(x==y){
                  count++;
                }
            }
            if(count == 1){
                unique = x;
            }
        }

        return unique;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 4, 3, 5, 2, 3, 5, 1, 4));
        System.out.println(solve(al));
    }
}
