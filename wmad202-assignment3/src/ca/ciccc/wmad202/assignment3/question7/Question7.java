package ca.ciccc.wmad202.assignment3.question7;

public class Question7 {
        public static int linearSearch(int[] arr, int key){
            for(int i=0;i<arr.length;i++){
                if(arr[i] == key){
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] a){
            int[] a1= {1, 20, 33, 42, 50, 87};
            int key = 20;
            System.out.println(key+" is found at index "+linearSearch(a1, key));
        }
    }

