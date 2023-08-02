package arrayDay1;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        System.out.println(solveReverseArray(arr));
    }
    public static int[] solveReverseArray(final int[] arr){
        int n = arr.length-1;
        int temp =0;
        int p1 =0;
        int p2 = n-1;
        for(int i=p1; i<=p2; i++){
            if(i==n-i){
                break;
            }
            temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
        return arr;
    }
}
