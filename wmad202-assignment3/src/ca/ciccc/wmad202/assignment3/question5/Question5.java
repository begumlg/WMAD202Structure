package ca.ciccc.wmad202.assignment3.question5;

public class Question5 {

    public static void main(String[] args) {
        int [] arr = new int [] {1, 4, 5, 4, 8, 9, 12, 45, 12, 8, 12, 33};

        System.out.println("Duplicate elements in the array: ");

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}


