package org.example;

public interface EmployeeDaoIntrf {

    // create employee
    public void createEmployee(Employee emp);

    // show all employee
    public void showALlEmployee();

    // show employee based on id
    public void showEmployeeBasedOnID(int id);

    // update employee
    public void updateEmployee(int id, String name);

    // delete employee
    public void deleteEmployee(int id);
}
