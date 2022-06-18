package ca.ciccc.wmad202.assignment3.question3;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        int i, j, n;

        System.out.print("Please enter a number: ");
        Scanner number = new Scanner(System.in);
        System.out.print("Please enter format: ");
        Scanner format = new Scanner(System.in);
        /*
        if(format==shape1(int n)){
            shape1(int number);
        }
        if(format==shape2(int n)){
            shape2(int number);
        }
        if(format==shape3(int n)){
            shape3(int number);
        }
*/
    }

    public static void shape1(int n) {
        /*int scanner = 0;*/
        for(int i = n; i >= 1; --i) {
            for(int space = 1; space <= n - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

        }
    }


    public static void shape2(int n) {
        /*int scanner = 0;*/
        for (int i = n; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {


            System.out.print("* ");
    }
}
    }

    public static void shape3(int n) {
        /*int scanner = 0;*/
        for (int i = 1; i <= n; ++i) {
            for (int j = n; j <= i; ++j) {
                System.out.print("* ");

    }
        }
    }
}



