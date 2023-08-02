package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ALCode {
        public static void main(String[] args) {
//        Integer | Float | String | Boolean
            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<String> list2 = new ArrayList<String>();
            ArrayList<Boolean> list3 = new ArrayList<Boolean>();

            // add elements
            list.add(10);
            list.add(2);
            list.add(3);

            System.out.println(list);

            //get elements
            int element = list.get(2);
            System.out.println(element);

            //add elements in between
            list.add(1, 11);
            System.out.println(list);

            //set element
            list.set(2, 22);
            System.out.println(list);

            //delete/remove
            list.remove(3);
            System.out.println(list);

            //size
            int size = list.size();
            System.out.println(size);

            //loops
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println();

            //Sorting
            Collections.sort(list);


        }
}
