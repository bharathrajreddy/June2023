package oneDArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        /*First line of the input contains number of test cases as single integer T .
        Next, each of the test case consists of 3 lines:

        First line contains a single integer A denoting the length of array
        Second line contains A integers denoting the array elements
        Third line contains a single integer B
        */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int k=0;k<T;k++){
            int A = sc.nextInt();
            int[] N = new int[A];
            for(int i=0; i<A; i++){
                N[i]= sc.nextInt();
            }
            int B = sc.nextInt();
            int out = 0;
            for(int i=0; i<A; i++){
                if(N[i]==B){
                    out =1;
                    break;
                }
            }
            System.out.println(out);
        }

        ArrayList<Integer> arr = new ArrayList<Integer>(5);

        // using add() to initialize values
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println(arr.size());
    }
}
