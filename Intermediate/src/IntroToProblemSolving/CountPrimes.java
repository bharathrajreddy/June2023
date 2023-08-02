package IntroToProblemSolving;

public class CountPrimes {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(calculatePrime(10));
    }
    public static int calculatePrime(int num){
        int prime=0;
        for(int i=1; i<=num; i++){
            int count =0;
            for(int j=1; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    if(i==Math.sqrt(i)){
                        count++;
                    }else{
                        count = count+2;
                    }
                }
            }
            if(count == 2){
                prime++;
            }
        }
        return prime;
    }
}
