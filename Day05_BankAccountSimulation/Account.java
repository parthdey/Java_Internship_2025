public class Account {
    private static int accountCounter = 1000;
    private int accountNumber;
    private String name;
    private int age;
    private String citizenship;
    private String aadhaarNumber;
    private double balance;

    public Account(String name, int age, String citizenship, String aadhaarNumber) {
        this.accountNumber = ++accountCounter;
        this.name = name;
        this.age = age;
        this.citizenship = citizenship;
        this.aadhaarNumber = aadhaarNumber;
        this.balance = 0.0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposit successful! New Balance: ₹" + balance);
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawal successful! Remaining Balance: ₹" + balance);
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Assigned Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Citizenship: " + citizenship);
        System.out.println("Aadhaar Number: " + aadhaarNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
