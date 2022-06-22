package ca.ciccc.wmad202.assignment4.question3;

public class Question3 {

    static int DivisibleNum(int n) {
        for(int j = 1; j < n + 1; j++)
        {
            if ( j % 2 == 0 ||
                    j % 3 == 0 ||
                    j % 4 == 0 ||
                    j % 5 == 0 ||
                    j % 6 == 0 ||
                    j % 7 == 0 ||
                    j % 8 == 0 ||
                    j % 9 == 0 )
                System.out.print(j + " ");
        }
        return n;
    }

    public static void main(String args[])
    {
        int N = 50;

        DivisibleNum(N);
    }
}




