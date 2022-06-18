package ca.ciccc.wmad202.assignment3.question9;

import ca.ciccc.wmad202.assignment3.question1.Question1;

import java.util.Scanner;
import java.util.ArrayList;

public class Question9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = s.nextInt();

        if (primeNumber(n)) {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
    }
    public static boolean primeNumber(int n) {
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
    public static ArrayList<Integer> primeVisibility(ArrayList<Integer> arrayList, int index ){
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 0;i<= index;i++){
            if (Question1.primeNumber(arrayList.get(i))){
                primeList.add(arrayList.get(i));

            }
        }
        return primeList;

    }
    public static ArrayList<Integer> makeList() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Please enter numbers: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while (number < 100) {   // Stops when enter greater than 100 and makes list
            list.add(number);
            number = input.nextInt();
        }
        return list;

    }
}


