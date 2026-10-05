package conditionals;

import java.util.Scanner;

public class pass_or_fail {

    public static void main(String[] args) {

        System.out.println("Enter marks of English: ");
        Scanner sc = new Scanner(System.in);
        int English = sc.nextInt();
        System.out.println("Enter marks of Hindi: ");
        int Hindi = sc.nextInt();
        System.out.println("Enter marks of French: ");
        int French = sc.nextInt();

        int total = English + Hindi + French;
        int percentage = (total*100)/300;
        System.out.println("Percentage is " + percentage);

        if(English >=33 && Hindi >=33 && French >=33 && percentage>=40) {

            System.out.println("Pass");
        }
            else {
                System.out.println("Fail");
            }
        }

        }


