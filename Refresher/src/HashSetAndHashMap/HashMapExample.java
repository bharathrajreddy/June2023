package HashSetAndHashMap;

import java.security.Key;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
//        HashMap<KeyType, Valuetype> hm = new HashMap<KeyType, Valuetype>();
        HashMap<String, Integer> hm = new HashMap<>();
        // Basic Operation for hashmap
        //put : we can add Key Value Pair
        hm.put("Punjab", 15);
        hm.put("Delhi", 15);
        hm.put("Telangana", 15);
        hm.put("AP", 15);
        System.out.println(hm);

        //contains Key
        System.out.println(hm.containsKey("Delhi"));
        System.out.println(hm.containsKey("Telangana"));

        //fetch corresponding Value of key
        System.out.println(hm.get("Delhi"));
        System.out.println(hm.get("Gujarat"));

        //update
        System.out.println(hm.put("Delhi", 20));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //remove
//        hm.remove("Delhi");
//        System.out.println(hm.remove("Delhi"));

        // get all keys
        System.out.println(hm.keySet());
        System.out.println(hm);

        //iterate Key to get value
        for(String s : hm.keySet()){
            System.out.println(s+" "+hm.get(s));
        }

    }
}
