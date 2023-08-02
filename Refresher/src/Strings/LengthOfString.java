package Strings;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1; i<=T; i++){
            String str = sc.nextLine();
            int n = str.length();
            System.out.println(n);
        }
    }
}
