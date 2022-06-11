package ca.ciccc.wmad202.assignment2.question4;
import java.util.Scanner;
public class Question4 {
        public static void main() {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;


            Scanner s = new Scanner(System.in);
            while (true) {
                System.out.print("Enter a Value: ");
                int val = s.nextInt();

                if (val == 0) {
                    break;
                }
                if (val < min) {
                    min = val;
                }
                if (val > max) {
                    max = val;
                }
            }

            System.out.println("min: " + min);
            System.out.println("max: " + max);
            System.out.printf("The absolute distance between Min and Max is: %d%n", max - min);
        }
    }


