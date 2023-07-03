package whileLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int reverse=0, lastDigit=0;
        int num =A;
        while(num>=1){
            lastDigit = num%10;
            reverse = ((reverse*10)+lastDigit);
            num = num/10;
        }
        if(reverse == A){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
