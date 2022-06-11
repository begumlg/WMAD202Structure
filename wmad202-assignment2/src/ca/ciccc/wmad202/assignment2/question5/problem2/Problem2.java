package ca.ciccc.wmad202.assignment2.question5.problem2;

import java.util.Scanner;

    public class Problem2{
        public static void main(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter word:");
            String str = scanner.nextLine();

            StringBuilder sb = new StringBuilder();

            for(int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }

            System.out.println("Reversed word is:");
            System.out.println(sb.toString());
        }


    }





