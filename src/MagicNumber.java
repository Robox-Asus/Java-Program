import java.util.Scanner;

//          Write a Java Program to check if any number is a magic
//        number or not. A number is said to be a magic number if
//        a􀈅er doing sum of digits in each step and inturn doing sum
//        of digits of that sum, the ultimate result (when there is
//        only one digit le􀈅) is 1.
public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number t check whether it is magic number or not : ");
        int input = scanner.nextInt();

        magicNumber(input);
    }

    private static void magicNumber(int input) {
        int num = input; // 163 is a magic number
        int sumOfDigits = 0;
        while (num > 0 || sumOfDigits > 9)
        {
            if (num == 0)
            {
                num = sumOfDigits;
                sumOfDigits = 0;
            }
            sumOfDigits += num % 10;
            num /= 10;
        }

        // If sum is 1, original number is magic number
        if(sumOfDigits == 1) {
            System.out.println("Magic number");
        }else {
            System.out.println("Not magic number");
        }
    }
}
