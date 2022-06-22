package ca.ciccc.wmad202.assignment4.question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question6 {

        public static void main(String[] args) throws Exception
        {
            ArrayList<String> listOne = new ArrayList<>(Arrays.asList("1", "3", "4", "7", "8"));

            ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("2", "1", "4", "5", "6"));

            ArrayList<String> listThree = new ArrayList<>(Arrays.asList("3", "4", "8", "9", "7"));

            List<String> listTwoCopy = new ArrayList<>(listTwo);
            listTwoCopy.removeAll(listOne);
            listOne.addAll(listTwoCopy);

            List<String> listThreeCopy = new ArrayList<>(listThree);
            listTwoCopy.removeAll(listTwo);
            listTwo.addAll(listThreeCopy);

            System.out.println(listTwo);

        }
    }

