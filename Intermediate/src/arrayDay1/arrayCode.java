package arrayDay1;

public class arrayCode {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[0]);
        System.out.println(arr[4]);

        arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        for(int x: arr){
            System.out.print(x+" ");
        }

    }
}
