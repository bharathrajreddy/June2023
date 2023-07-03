package forLoop;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int num = 0;
        int hcf = 0;
        if(A<B){
            num = A;
        }else{
            num = B;
        }
        for(int i=num; i>=2; i--){
            if(A%i == 0 && B%i == 0){
                hcf = i;
                break;
            }
        }
        System.out.print(hcf);
    }
}
