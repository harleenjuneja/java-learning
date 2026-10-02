package basics;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        int sum = num + num2;
        System.out.println(sum);

    }
}
