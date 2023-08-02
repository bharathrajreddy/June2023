package arrayDay1;

public class RotateAnArray {
    public static void main(String[] args) {
        int[] arr = {7,4,2,10,5};
        int n = arr.length;
        int B = 10;
        B=B%n;
        System.out.println(reverse(arr, 0, n-1));
        System.out.println(reverse(arr, 0, B-1));
        System.out.println(reverse(arr, B, n-1));
    }
    public static int[] reverse(int[] arr, int B, int C) {
        int n = arr.length;
        int temp =0;
        int p1 =B;
        int p2 = C;
        while(p1<p2){
            temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        return arr;
    }
}
