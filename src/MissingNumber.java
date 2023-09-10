//      Given an array of non-duplicating numbers from 1 to n
//      where one number is missing, write an efficient java
//      program to find that missing number.
//      To Solve this first get the length of array add 1 to it
//      Then use sum of Natural Number formula and use length as n to it and get the result as sumofNature
//      Then sum of all the element present in the array as ActualSum
//      The difference of these number give us the missing number
//      Note the series they are giving is from 1 to n. No negative number included

public class MissingNumber {
    public static void main(String[] args) {
        int[] array={4,3,8,7,5,2,6};
        int missingNumber = findMissingNum(array);
        System.out.println("Missing Number is "+ missingNumber);
    }

    private static int findMissingNum(int [] array) {
        int n = array.length+1;

        System.out.println("Array Length Increased by 1 : "+n);

         // Sum of Natural Number
        int sumOfFirstNNums = n * ( n + 1 ) / 2;

        // Sum of Actual Number
        int actualSumOfArr = 0;
        for(int i : array) {
            actualSumOfArr += i;
        }

        System.out.println("Sum Of Natural Number : "+sumOfFirstNNums);
        System.out.println("Sum of Actual Number : "+actualSumOfArr);

        // Difference of Sum of Natural Number - Actual Number Sum gives the missing number
        return sumOfFirstNNums-actualSumOfArr;
    }
}
