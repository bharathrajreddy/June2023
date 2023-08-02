package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CubeArray {
    public static void main(String[] args) {

    }
    public ArrayList<Long> solve(ArrayList<Integer> A) {
            ArrayList<Long> B = new ArrayList<>();
            for(int i=0; i<A.size(); i++){
                double D = Math.pow((long)A.get(i),3);
                B.set(i,(long)D);
            }
            return B;

//        ArrayList<Double> B = new ArrayList<>();
//        for(int i=0; i<A.size(); i++){
//            B.add(Math.pow(A.get(i),3 ));
//        }
//        ArrayList<Long> D = new ArrayList<>(Arrays.asList(B));
//        return B;
    }
}
