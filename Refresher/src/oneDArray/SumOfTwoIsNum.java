package oneDArray;

public class SumOfTwoIsNum {
    public static void main(String[] args) {
        int[] A = {2,3,2,4};
        int B = 3;
        System.out.println(solve(A,B));
    }

    private static int solve(int[] a, int b) {
        int num=0;
        int N = a.length;
        for(int i=0; i<N;i++){
            for(int j=i+1;j<N; j++){
                if(a[i]+a[j]==b){
                    num = 1;
                    break;
                }
            }
        }
        return num;
    }
}
