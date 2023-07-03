package patterns;

import java.util.Scanner;

public class FullNumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            for(int k=1; k<=(N-i); k++){
                System.out.print(0);
            }
            for(int j=1; j<=((2*i)-1); j++){//i=2,
                int num = N+1-i;
                    System.out.print(num*j);
            }
            for(int k=1; k<=(N-i); k++){
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
