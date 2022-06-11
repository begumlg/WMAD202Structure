package ca.ciccc.wmad202.assignment2.question9;
import java.util.Scanner;

public class Question9 {
    public static void checkName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name:");

            String input2 = input.nextLine();
            boolean result= input2.matches("[a-zA-Z]+");
            if(result) {
                System.out.println(input2.toUpperCase());

            }
            else{
                return;
            }
    }




}
