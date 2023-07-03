package patterns;

import java.util.Scanner;

public class SpaceStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int row=1;row<=N;row++){
            for(int space=1;space<=N-row; space++){
                System.out.print(" ");
            }
            for(int star=1;star<=row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
