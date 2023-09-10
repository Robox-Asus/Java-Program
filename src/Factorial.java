import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Input the Number to get factorial of it : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = factorial(input);
        System.out.println(input + " : " + result);
    }

    private static int factorial(int input) {
        if(input == 0 || input == 1) {
            return 1;
        }
        return input * factorial(input - 1);
    }
}
