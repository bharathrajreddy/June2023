package forLoop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;  i<=N; i++){
            int P = i;
            int M= 0;
            int rem=0, div=0;
            int temp=P;
            while(temp>0){
                rem = temp%10;
                temp=temp/10;
                M = M+(rem*rem*rem);
            }
            if(M==P){
                System.out.println(M);
            }
        }
    }
}
