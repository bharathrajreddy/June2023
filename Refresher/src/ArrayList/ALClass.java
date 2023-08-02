package ArrayList;

import java.util.ArrayList;

public class ALClass {
    public static void main(String[] args) {
/*        Syntax
        ArrayList<Datatype> name = new ArrayList<Datatype>();
        we cant have primitive datatype
*/
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(20);
        al.add(40);
        al.add(40);
        al.add(50);
        System.out.println(al);
        al.set(1, 30);
        System.out.println(al);
//        get : to fetch an element
        System.out.println(al.get(1));
//        remove : to fetch an element
        al.remove(1);
        System.out.println("after removing 1st index"+al);

/*       why cant we use ArrayList instead of Array or
         when to use Array and when to use ArrayList
      case 1: if size of the array is pre-defined,
            if performance is very critical for the app'n, it's better to use Array.
                eg: IRCTC tatkal booking
            if performance is not that critical we could go for Array List
       Case 2: if size is not predefined
            in this case we have to go with ArrayList, as Arraylist allocates memory dynamically.
*/
    }
}
