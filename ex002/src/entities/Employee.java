package entities;

public class Employee {

    public String Name;
    public double GrossSalary, Tax;
    public double NetSalary() {
        return GrossSalary - Tax;
    }
    public void IncreaseSalary(double percentage) {
        GrossSalary += GrossSalary * percentage / 100.0;
    }
    public String toString() {
        return  Name
            +   ", $"
            +   String.format("%.2f%n", NetSalary());
    }
}
