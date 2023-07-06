package functions;
public class PerfectSquare {
    public static int solve(int A) {
        double num = Math.sqrt(A);System.out.println(num*num);
        if((num)%1 == 0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int num = 1332;
        System.out.println(solve(num));
    }
}
