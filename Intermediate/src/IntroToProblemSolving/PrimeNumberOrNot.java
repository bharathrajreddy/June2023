package IntroToProblemSolving;

import IntroToProblemSolving.FactorofNumberN;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int A = 2;
        System.out.println(solve(A));
    }
    public static void countPrimes(int N){
        for(int i=1; i<=N; i++){
            solve(i);
        }

    }
    public static int solve(int A){
        int b =0, count=0;
        for(int i=2;i<=Math.sqrt(A); i++){
            if(A%i==0){
                if(i==Math.sqrt(A)){
                    count++;
                }else{
                    count = count+2;
                }
            }
        }
        if(count != 2){
            b = 0;
        }else{
            b++;
        }

        return b;
    }
}
