package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class IdentityMatrix {
    public int solve(final List<ArrayList<Integer>> A) {
        int res =0;
        for(int i=0; i< A.size();i++){
            for(int j=0; j<A.get(0).size(); j++){
                if(i==j){
                    if(A.get(i).get(j)==1){
                        res =1;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return res;
    }
}
