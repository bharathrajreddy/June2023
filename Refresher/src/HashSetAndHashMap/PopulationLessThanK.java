package HashSetAndHashMap;

import java.util.*;
import java.util.Map;

public class PopulationLessThanK {

    public static int population(HashMap<String, Integer> H, int K){
        int count =0;
        for(Map.Entry<String, Integer> e : H.entrySet()){
            if(e.getValue()<K){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        HashMap<String, Integer> H = new HashMap<>();
    }
}
