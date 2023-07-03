package patterns;

import java.util.Scanner;

public class PrimesFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counter =0;
        for(int i=2; i<=N; i++){
            counter =0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    counter++;
                }
            }
            if(counter == 2){
                System.out.println(i);
            }
        }
    }
}