package arrayDay1;

// all pair, optimised, HashMap, Sort+ BinarySort, Sort+2pointer

public class SumOfPairsIsK {
    public static void main(String[] args) {
        int[] arr = {5,3,4,7,6};
        int k = 8;
        solvePair(arr, k);
        System.out.println("optimised solution");
        solvePairOptimised(arr,k);
    }

    public static void solvePairOptimised(int[] arr, int k){ // TC = O(n^2)
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[i]+arr[j]==k){
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }
    public static void solvePair(int[] arr, int k){ //TC = O(n^2)
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]!=arr[j] && arr[i]+arr[j]== k){
                    System.out.print("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }
    public static void SolvePairHashMap(int[] arr, int k){

    }
}
