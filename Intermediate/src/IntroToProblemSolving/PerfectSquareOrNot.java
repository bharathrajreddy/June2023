package IntroToProblemSolving;

public class PerfectSquareOrNot {
    public static long solve(int A) {
        long res=-1;
        if(A!=1){
            for(long i=1; i<=A/2; i++){
                if(i*i==A){
                        res = i;
                        break;
                }
            }
            return (int)res;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int A = 84630800;
        System.out.println(Math.sqrt(A));
        System.out.println(solve(A));
    }
}
