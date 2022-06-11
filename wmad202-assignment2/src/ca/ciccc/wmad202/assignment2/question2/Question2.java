package ca.ciccc.wmad202.assignment2.question2;
import java.util.Scanner;

public class Question2 {

        public static int keepAsking(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            while(num % 10 == 0){
                System.out.println("Invalid number! Please enter another number: ");
                num = scan.nextInt();

            }
            return num;
        }

        public static String reversedNumber(int num){
            String reversedNum = "";
            while(num >= 10){
                reversedNum += String.valueOf(num % 10);
                num = num / 10;
            }
            return reversedNum + String.valueOf(num);
        }
    }


