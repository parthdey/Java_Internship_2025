import java.util.ArrayList;
import java.util.Scanner;

public class Withdraw {
    public static void withdrawMoney(ArrayList<Account> accounts) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        Account acc = Deposit.findAccount(accounts, accNo);
        if (acc != null) {
            System.out.print("Enter withdrawal amount: ₹");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    private static Account findAccount(ArrayList<Account> accounts, int accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }
}

