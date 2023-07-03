package patterns;

import java.util.Scanner;

public class SpaceStarPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int row=1;row<=N;row++){
            for(int star=1;star<=N+1-row; star++){
                System.out.print("*");
            }
            for(int space=1;space<=2*(row-1); space++){
                System.out.print(" ");
            }
            for(int star=1;star<=N+1-row; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
