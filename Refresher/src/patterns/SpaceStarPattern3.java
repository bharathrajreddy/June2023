package patterns;

import java.util.Scanner;

public class SpaceStarPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int row=1;row<=N;row++){
            for(int space=1;space<=N-row; space++){
                System.out.print(" ");
            }
            for(int star=1;star<=2*row - 1; star++){
                System.out.print("*");
            }
            for(int space=1;space<=N-row; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
