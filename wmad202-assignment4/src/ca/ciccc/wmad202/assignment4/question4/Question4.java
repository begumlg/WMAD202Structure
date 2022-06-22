package ca.ciccc.wmad202.assignment4.question4;

import java.util.ArrayList;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 2, 5, 7, 4, 3, 1, 5, 7 };
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    count++;
                }
            }
            if(count == 1) {
                arr.add(array[i]);
            }
        }
        System.out.println(arr.toString());
    }
}
