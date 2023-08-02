package oneDArray;

public class CountDuplicate {
    public static boolean solve(int arr[]) {
        // Complete the function here
        int n = arr.length-1;
        boolean doop = false;
        for(int i=0; i<=n-2; i++){
            if(arr[i]==arr[i+1]){
                doop = true;
                break;
            }
        }
        return doop;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,3};
        System.out.println(solve(a));
    }
}
