import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean keepGoing = true;
        double result = 0;

        while(keepGoing) {
            System.out.println("Choose operation: +, -, *, /");
            String op = scanner.next();

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();


            switch (op.toLowerCase()) {
                case "+":
                    result = Calculator.add(num1, num2);
                    break;
                case "-":
                    result = Calculator.subtract(num1, num2);
                    break;
                case "*":
                    result = Calculator.multiply(num1, num2);
                    break;
                case "/":
                    result = Calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation.");
                    continue;
            }
            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculatoin? (y/n): ");
            String again = scanner.next();
            keepGoing = again.equalsIgnoreCase("y");
        }

        scanner.close();
        System.out.println("Thank you for using the calculator!");
    }
}










































