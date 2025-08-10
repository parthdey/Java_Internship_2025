import java.io.*;
import java.util.Scanner;

public class NotesApp {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\n--- Notes App ---");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addNote(scanner);
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addNote(Scanner scanner){
        System.out.println("Write: ");
        String note = scanner.nextLine();

        try (FileWriter fw = new FileWriter(FILE_NAME, true)){
            fw.write(note + "\n");
            System.out.println("Note saved!");
        }catch (IOException e){
            System.out.println("Error writing note: "+ e.getMessage());
        }
    }

    private static void viewNotes(){
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println("- "+ line);
            }
        }catch (FileNotFoundException e){
            System.out.println("No notes found. Add some first!");
        }catch (IOException e){
            System.out.println("Error reading notes: "+ e.getMessage());
        }
    }
}































