package application;

import java.util.*;
import entities.Student;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.print("Insert the name: ");
        st.name = sc.nextLine();
        System.out.println();

        System.out.print("First grade: ");
        st.grade1 = sc.nextDouble();
        System.out.println();

        System.out.print("Second Grande:");
        st.grade2 = sc.nextDouble();
        System.out.println();

        System.out.print("Third Grade: ");
        st.grade3 = sc.nextDouble();
        System.out.println();

        System.out.println(st.name + ":");
        System.out.println(st.finalGrade());

        sc.close();

    }
}