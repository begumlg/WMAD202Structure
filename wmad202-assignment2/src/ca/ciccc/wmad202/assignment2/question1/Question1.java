package ca.ciccc.wmad202.assignment2.question1;

import java.util.Scanner;


public class Question1 {


    public void divisibleNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number1 = scan.nextInt();
        System.out.println("Please enter another number: ");
        int number2 = scan.nextInt();

        if (number1 < number2) {
            for (int i = number1 + 1; i < number2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.printf("%d is divisible by 3 and 5 ", i);
                    System.out.println();
                }


            }
            for (int i = number1; i < number2; i++) {
                if (i % 6 == 0 || i % 7 == 0) {
                    System.out.printf("%d is divisible by 6 or 7  ", i);
                    System.out.println();
                }

            }
            for (int i = number1; i <= number2; i++) {
                if (i % 3 != 0) {
                    System.out.printf("%d is not divisible by 3 ", i);
                    System.out.println();
                }

            }

        } else {
            for (int i = number2 + 1; i < number1; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.printf("%d is divisible by 3 and 5 ", i);
                    System.out.println();
                }

            }
            for (int i = number2; i < number1; i++) {
                if (i % 6 == 0 || i % 7 == 0) {
                    System.out.printf("%d is divisible by 6 or 7  ", i);
                    System.out.println();

                }
            }
            for (int i = number2; i <= number1; i++) {
                if (i % 3 != 0) {
                    System.out.printf("%d is not divisible by 3 ", i);
                    System.out.println();

                }
            }

        }
    }


}



