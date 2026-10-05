package conditionals;

import java.util.Scanner;

public class income_tax_paid {

    public static void main(String[] args) {

        System.out.println("Enter the Income of the Employee");
        Scanner input = new Scanner(System.in);
        int income = input.nextInt();
        //SLab 1 (2.5-5.0L)
        if (income >=250000 && income < 500000){

                System.out.println("Income tax to be paid is 5%");

        }
        //Slab 2 (5.0-10.0L)
        else if (income >=500000 && income <1000000){

                System.out.println("Income tax to be paid is 20%");
            }

        //Slab 3 (above 10.0L)
        else if (income >=1000000){
            System.out.println("Income tax to be paid is 30%");
        }
        else if (income < 250000){
            System.out.println("Congratulations! No Income Tax to be paid");
        }
    }
}
