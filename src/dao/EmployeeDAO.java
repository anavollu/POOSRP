package dao;

import java.util.HashSet;
import java.util.Set;
import models.Employee;

public class EmployeeDAO {

    private static Set<Employee> employees = new HashSet<>();
    private static long id = 1L;

    public Employee saveEmployeeToDatabase(Employee employee) {
        if(!EmployeeDAO.employees.contains(employee) && employee != null){
            employee.setId(EmployeeDAO.id);
            EmployeeDAO.id++;
            EmployeeDAO.employees.add(employee);
        }
        return employee;
    }

    public void terminateEmployee(long id) {
        Employee emp = new Employee("", "", true);
        emp.setId(id);
        employees.remove(emp);
    }

    public Set<Employee> getAllEmployees() {
        return EmployeeDAO.employees;
    }
}
