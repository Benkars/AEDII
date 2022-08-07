package CursoUdemy.POO.Ex02;

public class Employee {
    String name;
    double grossSalary, tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double increase) {
        grossSalary += grossSalary * increase / 100.0;
    }

    public String toString() {
        return "Updated data: " + name + ", $ " + String.format("%.2f", netSalary());
    }
}