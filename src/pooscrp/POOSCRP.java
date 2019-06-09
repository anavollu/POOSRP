package pooscrp;

import dao.EmployeeDAO;
import models.Employee;
import reports.EmployeeReport;

public class POOSCRP {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1L, "joao", "finanças", true);
        Employee emp2 = new Employee(2L, "carlos", "finanças", true);
        Employee emp3 = new Employee(3L, "bruno", "finanças", true);
        Employee emp4 = new Employee(4L, "marcelo", "finanças", true);

        EmployeeReport empReport = new EmployeeReport();
        System.out.println("Print XML REPORT employee 1");
        empReport.printEmployeeDetailReportXML(emp1);

        System.out.println("\nPrint XML REPORT employee 2");
        empReport.printEmployeeDetailReportCSV(emp2);

        EmployeeDAO empDao = new EmployeeDAO();
        empDao.saveEmployeeToDatabase(emp1);
        empDao.saveEmployeeToDatabase(emp2);
        empDao.saveEmployeeToDatabase(emp3);
        empDao.saveEmployeeToDatabase(emp4);

        System.out.println("\nPrint fake database with all employees");
        System.out.println(empDao.getAllEmployees());

        empDao.terminateEmployee(1L);
        System.out.println("\nPrint fake database with all employees after remove employee 1");
        System.out.println(empDao.getAllEmployees());
    }

}
