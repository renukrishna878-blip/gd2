
package org.example;

public class Main {

    public static double calculateAverage(int m1, int m2, int m3) {
        return (m1 + m2 + m3) / 3.0;
    }

    public static String calculateGrade(double average) {

        if (average >= 90)
            return "A";

        else if (average >= 75)
            return "B";

        else if (average >= 50)
            return "C";

        else
            return "Fail";
    }

    public static void main(String[] args) {

        int m1 = 85;
        int m2 = 90;
        int m3 = 80;
        double average = calculateAverage(m1, m2, m3);

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + calculateGrade(average));
    }
}
