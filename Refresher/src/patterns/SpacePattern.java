package patterns;

import java.util.Scanner;

public class SpacePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int row=1;row<=N;row++){
            System.out.print("*");
            for(int j=1;j<=N-row; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
