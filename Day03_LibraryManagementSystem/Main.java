import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        // add some books and users
        library.addBook(new Book("Java Basics", "James Gosling"));
        library.addBook(new Book("Python 101", "Guido van Rossum"));
        library.addUser(new User(1, "Rahul"));
        library.addUser(new User(2, "Aditi"));

        Scanner scanner  = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner .nextInt();
            scanner.nextLine(); // Clear newline


            switch (choice) {
                case 1:
                    library.listBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = scanner .nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 3:
                    System.out.print("Enten book title to return: ");
                    String returnTitle = scanner .nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 0:
                    System.out.println("Goodbye 👋");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }while (choice != 0);

        scanner .close();
    }
}





























