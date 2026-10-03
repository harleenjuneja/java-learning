package basics;

import java.util.Scanner;

public class integer_or_not {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The number "+number + " is an integer");
    }
}
