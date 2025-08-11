import java.util.ArrayList;
import java.util.Scanner;

public class Deposit {
    public static void depositMoney(ArrayList<Account> accounts) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = findAccount(accounts, accNo);
        if (acc != null) {
            System.out.print("Enter deposit amount: ₹");
            double amount = sc.nextDouble();
            acc.deposit(amount);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    static Account findAccount(ArrayList<Account> accounts, int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }
}
