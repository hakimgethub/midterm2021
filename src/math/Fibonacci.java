package math;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */



                // Set it to the number of elements you want in the Fibonacci Series
                int maxNumber = 40;
                int previousNumber = 0;
                int nextNumber = 1;

                System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

                for (int i = 1; i <= maxNumber; ++i)
                {
                    System.out.print(previousNumber+" ");
                    /* On each iteration, we are assigning second number
                     * to the first number and assigning the sum of last two
                     * numbers to the second number
                     */


                    int sum = previousNumber + nextNumber;
                    previousNumber = nextNumber;
                    nextNumber = sum;
                }
            }
        }






/*Using  While Loop
        public class FibonacciWhileExample {
    public static void main(String[] args) {
        int maxNumber = 10, previousNumber = 0, nextNumber = 1;
        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        int i = 1;
        while (i <= maxNumber) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }

    }

}

*/