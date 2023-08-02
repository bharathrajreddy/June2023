package IntroToProblemSolving;

public class FactorofNumberN {
    public static void main(String[] args) {
        int number = 24;//1,2,3,4,6,8,12,24
        number=36;//1,2,3,4,6,9,12,18,36
        System.out.println(solve(number));
    }
    public static int solve(int num){
        int count =0;
        for(int i=1; i<=Math.sqrt(num); i++){
            if(num%i==0){
                if(i==num/i){
                    count = count+1;
                }else{
                    count += 2;
                }
            }
        }
        return count;
    }
}
