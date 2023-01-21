package codeonedigest.javadesignpattern.behavioral.visitor;

public class EmployeeVacationVisitor extends EmployeeVisitor{

    int totalVacationDays;

    public EmployeeVacationVisitor() {
        totalVacationDays = 0;
    }

    @Override
    public void visit(Employee employee) {
        totalVacationDays += employee.getVacDays();
    }

    public int getTotalVacationDays() {
        return totalVacationDays;
    }
}
