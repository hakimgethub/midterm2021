package math;

import org.testng.Assert;

import java.util.ArrayList;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        //Factorial

        //Fibonacci

        //Find missing number

        //Lowest number

        //Pyramid

        //Pattern

        //Prime number


        try {
            Assert.assertEquals(Factorial.factorial(5), 120);
            System.out.println("Unit Testing has Passed for Factorial");
        } catch (AssertionError ar) {
            System.out.println("Unit testing has Failed for Factorial");
        }

        try {
            ArrayList<Integer> expectedArray = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
            int fab[] = new int[10];
            Assert.assertEquals(Fibonacci.arrayFibo(fab), expectedArray);
            System.out.println("Unit Testing has Passed for Fibonacci");
        } catch (AssertionError as) {
            System.out.println("Unit Testing has Failed for Fibonacci");
        }

        try {
            int[] array1 = {5, 9, 2, 20, 33, 1};
            int[] array2 = {17, 36, 14, 19};
            Assert.assertEquals(FindLowestDifference.lowestDifference(array1, array2), 13);
            System.out.println("Unit Testing has Passed for FindLowestDifference");
        } catch (AssertionError as) {
            System.out.println("Unit testing has Failed for FindLowestDifference");
        }

        try {
            int[] array = new int[]{10, 2, 1, 4, 5};
            int n = 6;
            Assert.assertEquals(FindMissingNumber.missingNumber(array, n), 5);
            System.out.println("Unit Testing has Passed for FindMissingNumber");
        } catch (AssertionError as) {
            System.out.println("Unit Testing has Failed for FindMissingNumber");
        }

        try {
            int array[] = new int[]{5, 679, 54, 32, 65};
            Assert.assertEquals(LowestNumber.lowestNumber(array), 5);
            System.out.println("Unit Testing has Passed for LowestNumber");
        } catch (AssertionError as) {
            System.out.println("Unit Testing has Failed for LowestNumber");
        }

        try {
            int n = 10;

            ArrayList<Integer> expectedArray = new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
            Assert.assertEquals(Pattern.arrayList(n), expectedArray);
            System.out.println("Unit Testing has Passed for Pattern");
        } catch (AssertionError as) {
            System.out.println("Unit Testing has Failed for Pattern");
        }
    }
}


