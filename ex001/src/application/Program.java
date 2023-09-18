package application;

import entities.Rectangle;

import java.sql.SQLOutput;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.print("Enter rectangle width: ");
        rect.width = sc.nextDouble();
        System.out.println();
        System.out.print("Enter rectangle height: ");
        rect.height = sc.nextDouble();

        System.out.printf("Area  = %.2f%n" , rect.Area());
        System.out.printf("Perimeter  = %.2f%n" , rect.Perimeter());
        System.out.printf("Diagonal  = %.2f%n" , rect.Diagonal());

        sc.close();
    }
}