package ca.ciccc.wmad202.assignment4.question1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Question1 {
    public void test(){
        enterNumber();
    }
    public void enterNumber() {
        Scanner in = new Scanner(System.in);
        Set<Integer> numberList = new HashSet<>();
        int num = 1;
        int total= 0;
        do {
            System.out.println("Please enter a number:");
            num = in.nextInt();
            if(num == 0) {
                for (Integer i: numberList){
                    total += i;
                }
                System.out.println("The sum of entered number : " + total);
                break;
            }else {
                numberList.add(num);
                System.out.println("Press 0 to stop.");
            }
        } while(num != 0);
    }

}
