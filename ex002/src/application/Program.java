package application;

import java.sql.SQLOutput;
import java.util.*;
import entities.Employee;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("What's your name? ");
        emp.Name = sc.nextLine();

        System.out.println(); // Pular linha

        System.out.print("Gross Salary: ");
        emp.GrossSalary = sc.nextDouble();

        System.out.println(); //

        System.out.print("Tax: ");
        emp.Tax = sc.nextDouble();

        System.out.println();

        System.out.printf("Employee: " + emp);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.IncreaseSalary(percentage);

        System.out.println("Update data: " + emp);

    }
}