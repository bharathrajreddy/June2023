package patterns;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal currentBalance = sc.nextBigDecimal();
        int M = sc.nextInt();
        for (int i = 1; i <= M; i++) {
            int Type = sc.nextInt();
            BigDecimal Amount = sc.nextBigDecimal();
            if (Type == 1) {
                currentBalance = currentBalance.add(Amount);
                System.out.print(currentBalance);
            }else if (Type == 2) {
                if (Amount.compareTo(currentBalance)>=1) {
                    System.out.print("Insufficient Funds");
                } else {
                    currentBalance = currentBalance.subtract(Amount);
                    System.out.print(currentBalance);
                }
            }
            System.out.println();
        }
    }
}
