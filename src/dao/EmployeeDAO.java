package dao;

import java.util.HashSet;
import java.util.Set;
import models.Employee;

public class EmployeeDAO {

    public static Set<Employee> employees = new HashSet<>();
    
    public Employee saveEmployeeToDatabase(Employee employee) {
        EmployeeDAO.employees.add(employee);
        return employee;
    }

    public void terminateEmployee(long id) {
        Employee emp = new Employee(id, "", "", true);
        employees.remove(emp);
    }
}
