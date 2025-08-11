import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while(running){
            System.out.println("\n==== Banking Menu ====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Citizenship: ");
                    String citizenship = sc.nextLine();
                    System.out.print("Enter Aadhaar Number: ");
                    String aadhaar = sc.nextLine();

                    Account newAcc = new Account(name , age, citizenship, aadhaar);
                    accounts.add(newAcc);
                    System.out.println("✅ Account created successfully!");
                    newAcc.displayAccountDetails();
                    break;
                case 2:
                    Deposit.depositMoney(accounts);
                    break;

                case 3:
                    Withdraw.withdrawMoney(accounts);
                    break;

                case 4:
                    running = false;
                    System.out.println("👋 Thank you for using the Banking App!");
                    break;

                default:
                    System.out.println("❌ Invalid option. Try again.");
            }
        }
        sc.close();
    }
}














































