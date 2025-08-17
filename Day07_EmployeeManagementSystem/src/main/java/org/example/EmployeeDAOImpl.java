package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAOImpl implements EmployeeDaoIntrf {
    Connection con;

    @Override
    public void createEmployee(Employee emp) {
        con = DBConnection.createDBConnection();
        String query = "INSERT INTO employee (name, salary, age) VALUES (?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, emp.getName());
            pst.setDouble(2, emp.getSalary());
            pst.setInt(3, emp.getAge());

            int cnt = pst.executeUpdate();
            if(cnt != 0){
                System.out.println("✅ Employee Inserted Successfully");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void showALlEmployee() {
        con = DBConnection.createDBConnection();
        String query = "SELECT * FROM employee";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            System.out.println("\n--- Employee List ---");
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Salary: " + rs.getDouble("salary") +
                        ", Age: " + rs.getInt("age"));
            }
            System.out.println("----------------------\n");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void showEmployeeBasedOnID(int id) {
        con = DBConnection.createDBConnection();
        String query = "SELECT * FROM employee WHERE id = ?";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Salary: " + rs.getDouble("salary") +
                        ", Age: " + rs.getInt("age"));
            } else {
                System.out.println("❌ Employee with ID " + id + " not found.");
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, String name) {
        con = DBConnection.createDBConnection();
        String query = "UPDATE employee SET name = ? WHERE id = ?";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setInt(2, id);

            int cnt = pst.executeUpdate();
            if(cnt != 0){
                System.out.println("✅ Employee Updated Successfully");
            } else {
                System.out.println("❌ Employee with ID " + id + " not found.");
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        con = DBConnection.createDBConnection();
        String query = "DELETE FROM employee WHERE id = ?";
        try {
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);

            int cnt = pst.executeUpdate();
            if(cnt != 0){
                System.out.println("✅ Employee Deleted Successfully");
            } else {
                System.out.println("❌ Employee with ID " + id + " not found.");
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
