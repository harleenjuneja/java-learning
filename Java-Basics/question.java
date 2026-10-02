package basics;

import java.util.Scanner;

public class question {
    //WAP to calculate percentage of a student where the marks are given from the user (Marks are out of 100)
    public static void main(String[] args) {
        System.out.println("Enter the marks of the student");
        Scanner sc = new Scanner(System.in);
        System.out.println("English: ");
        int marks = sc.nextInt();
        System.out.println("Hindi: ");
        int hindi = sc.nextInt();
        System.out.println("Maths: ");
        int maths = sc.nextInt();
        System.out.println("Science: ");
        int science = sc.nextInt();
        System.out.println("Sanskrit: ");
        int sans = sc.nextInt();

        int sum = marks + hindi + maths + science + sans;
        float total = sum/500.0f*100;
        System.out.printf("The total is: %.2f", total);
    }
}
