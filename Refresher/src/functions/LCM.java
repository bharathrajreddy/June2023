package functions;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int num = A>B?A:B;
        while(true){
            if(num%A==0 && num%B==0){
                break;
            }
            num++;
        }
        System.out.println(num);
    }
}
