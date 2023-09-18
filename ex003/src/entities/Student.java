package entities;

import java.text.Format;

public class Student {

    public double grade1, grade2, grade3;
    public String name;

    public double calcGrade() {
        return (grade1 + grade2 + grade3);
    }
    public String finalGrade() {

        if (calcGrade() > 60) {
            return  "Final Grade: " + String.format("%.2f%n" , calcGrade() ) + "PASS";
        }
        else {
            return  "Final Grade: " + String.format("%.2f%n", calcGrade())
                    + "FAILED"
                    + "\n"
                    + "MISSING: "
                    +  String.format("%.2f" , ((60 - calcGrade())))
                    + " POINTS";
        }
    }
}
