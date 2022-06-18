package ca.ciccc.wmad202.assignment3.question2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = s.nextInt();

        }

    public static boolean primeNumber(int n)

    {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }


        public static int nextPrime(int N) {

            if (N <= 1)
                return 2;

            int prime = N;
            boolean next = false;

            while (!next) {
                prime++;
                if (primeNumber(prime))
                    next = true;
            }

            return prime;
        }

}

