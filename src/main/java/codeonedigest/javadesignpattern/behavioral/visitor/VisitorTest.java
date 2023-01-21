package codeonedigest.javadesignpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorTest {
    public static void main(String args[]) {

        Employee employee1 = new Employee("pawan", 10, 20, 1000.0f);
        Employee employee2 = new Employee("john", 10, 22, 1000.0f);
        Employee employee3 = new Employee("adam", 10, 25, 1000.0f);
        Employee employee4 = new Employee("jessy", 10, 15, 1000.0f);
        Employee employee5 = new Employee("rakesh", 10, 10, 1000.0f);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        EmployeeVisitor employeeVacationVisitor = new EmployeeVacationVisitor();

        for (Employee employee : employeeList) {
            employeeVacationVisitor.visit(employee);
        }

        int totalVacationDays = ((EmployeeVacationVisitor)employeeVacationVisitor).getTotalVacationDays();
        System.out.println("Total Vacation Days - " + totalVacationDays);

    }
}
