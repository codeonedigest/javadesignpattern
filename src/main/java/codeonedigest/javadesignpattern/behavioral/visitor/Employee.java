package codeonedigest.javadesignpattern.behavioral.visitor;

public class Employee {

    String name;
    int sickDays;
    int vacDays;
    float salary;


    public Employee(String name, int sickDays, int vacDays, float salary) {
        this.name = name;
        this.sickDays = sickDays;
        this.vacDays = vacDays;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSickDays() {
        return sickDays;
    }

    public void setSickDays(int sickDays) {
        this.sickDays = sickDays;
    }

    public int getVacDays() {
        return vacDays;
    }

    public void setVacDays(int vacDays) {
        this.vacDays = vacDays;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
