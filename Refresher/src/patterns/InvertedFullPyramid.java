package patterns;

import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<N-i; j++){
                if(i==0 || j==0 || j==N-i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
//            for(int k=1;k<=i-1;k++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=N+1-i; j++){
//                System.out.print("* ");
//            }
            System.out.println();
        }
    }
}
