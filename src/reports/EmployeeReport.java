package reports;

import models.Employee;

public class EmployeeReport {

    public void printEmployeeDetailReportCSV(Employee employee) {
        StringBuilder sb = new StringBuilder();
        sb.append("id;name;working;department\n");
        sb.append(employee.getId()).append(";");
        sb.append(employee.getName()).append(";");
        sb.append(employee.isWorking()).append(";");
        sb.append(employee.getDepartment());
        System.out.println(sb.toString());
    }

    public void printEmployeeDetailReportXML(Employee employee) {
        StringBuilder sb = new StringBuilder();
        sb.append("<employee>\n");
        sb.append("\t<id>").append(employee.getId()).append("</id>\n");
        sb.append("\t<name>").append(employee.getName()).append("</name>\n");
        sb.append("\t<working>").append(employee.isWorking()).append("</working>\n");
        sb.append("\t<department>").append(employee.getDepartment()).append("</department>\n");
        sb.append("</employee>");
        System.out.println(sb.toString());
    }

}
