package ca.ciccc.wmad202.assignment3.question4;
import java.util.Arrays;
public class Question4 {
    public static void repeatedIntegers(){

            int element = Integer.MIN_VALUE, max_count=1, count=1;
            int[] arr = {3, 4, 6, 3, 8, 9, 20, 34, 20, 20, 4, 9};

        Arrays.sort(arr);

            for(int i=1; i<arr.length; i++){
                if(arr[i] == arr[i-1])
                    count++;

                if(arr[i] != arr[i-1] || i==arr.length-1){
                    if(count>max_count){

                        max_count = count;
                        element = arr[i-1];
                    }
                    count =1;
                }
            }

            System.out.println(element+": "+max_count);
        }
    }


