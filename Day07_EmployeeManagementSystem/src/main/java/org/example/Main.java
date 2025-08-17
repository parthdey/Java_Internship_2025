package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDaoIntrf dao = new EmployeeDAOImpl();
        System.out.println("Welcome to Employee Management Application");
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n1. Add Employee\n" +
                    "2. Show All Employees\n" +
                    "3. Show Employee by ID\n" +
                    "4. Update Employee\n" +
                    "5. Delete Employee\n" +
                    "6. Exit\n");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Employee emp = new Employee();
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);

                    dao.createEmployee(emp);
                    break;

                case 2:
                    dao.showALlEmployee();
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    dao.showEmployeeBasedOnID(id);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update: ");
                    int uid = sc.nextInt();
                    sc.nextLine(); // consume leftover newline
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();  // allows full names with spaces
                    dao.updateEmployee(uid, newName);
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int did = sc.nextInt();
                    dao.deleteEmployee(did);
                    break;

                case 6:
                    System.out.println("Thank you for using our Application !!!");
                    System.exit(0);

                default:
                    System.out.println("⚠️ Enter valid choice! ");
                    break;
            }
        } while (true);
    }
}
