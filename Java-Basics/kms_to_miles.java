package basics;

import java.util.Scanner;

public class kms_to_miles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kilometers");
        double miles = sc.nextDouble();
        double total_miles = miles * 0.621371192;
        System.out.println("Total miles: " + total_miles);
    }
}
