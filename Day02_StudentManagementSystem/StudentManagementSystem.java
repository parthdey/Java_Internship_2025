import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

    public class StudentManagementSystem {
        static Scanner scanner;
        static ArrayList<Student> students;

        public StudentManagementSystem() {
        }

        public static void main(String[] args) {
            while(true) {
                System.out.println("\nStudent Record Management System");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        viewStudents();
                        break;
                    case 3:
                        updateStudent();
                        break;
                    case 4:
                        deleteStudent();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }

        public static void addStudent() {
            System.out.println("Enter Student ID: ");
            String id = scanner.nextLine();
            System.out.println("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Marks: ");
            double marks = scanner.nextDouble();
            students.add(new Student(id, name, marks));
            System.out.println("## Student added successfully ##");
        }

        public static void viewStudents() {
            if (students.isEmpty()) {
                System.out.println("No students found");
            } else {
                for(Student s : students) {
                    System.out.println("ID: " + s.id + ", Name: " + s.name + ", Marks: " + s.marks);
                }

            }
        }

        public static void updateStudent() {
            System.out.println("Enter Students ID to update: ");
            String id = scanner.nextLine();
            boolean found = false;

            for(Student s : students) {
                if (Objects.equals(s.id, id)) {
                    System.out.println("Enter new ID: ");
                    String ID = scanner.nextLine();
                    System.out.println("Enter new name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter new marks: ");
                    double marks = scanner.nextDouble();
                    s.id = ID;
                    s.name = name;
                    s.marks = marks;
                    System.out.println("## Student updated successfully ##");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student with ID " + id + " not found");
            }

        }

        public static void deleteStudent() {
            System.out.println("Enter Students ID to delete: ");
            String id = scanner.nextLine();
            Iterator<Student> iterator = students.iterator();
            boolean found = false;

            while(iterator.hasNext()) {
                Student s = (Student)iterator.next();
                if (Objects.equals(s.id, id)) {
                    iterator.remove();
                    System.out.println("## Student deleted successfully ##");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student with ID " + id + " not found.");
            }

        }

        static {
            scanner = new Scanner(System.in);
            students = new ArrayList();
        }
}
