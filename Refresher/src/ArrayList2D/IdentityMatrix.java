package ArrayList2D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IdentityMatrix {
    public static void main(String[] args) {
        List<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        ArrayList a = new ArrayList<>(Arrays.asList(1,0,0));
        ArrayList b = new ArrayList<>(Arrays.asList(0,1,0));
        ArrayList c = new ArrayList<>(Arrays.asList(0,0,1));
        A.add(a);
        A.add(b);
        A.add(c);

        System.out.println(solve(A));
    }
    public static int solve(final List<ArrayList<Integer>> A) {
        int res =0;
        for(int i=0; i< A.size();i++){
            res =0;
            for(int j=0; j<A.get(0).size(); j++){
                if(i==j){
                    if(A.get(i).get(j).equals(1)){
                        res = 1;
                    }else{
                        res = 0;
                        break;
                    }
                }
            }
            if(res==0){
                break;
            }
        }
        return res;
    }
}
