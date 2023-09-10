import java.util.Scanner;

public class PrimeSum {
    // Method to Check Prime Number
//    Prime numbers are numbers greater than 1 that only have two factors, 1 and the number itself.
//    This means that a prime number is only divisible by 1 and itself. If you divide a prime number by a number other than 1 and itself,
//    you will get a non-zero remainder.
//    Numbers that have more than 2 factors (but finite number of factors) are known as composite numbers.

    private static boolean check_prime(int num){
        for(int i = 2; i<=num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    // Method to get print the prime sum
    private static void find(int num){
        for(int i = 2; i <= num/2; i++){
            if(check_prime(i)){
                if(check_prime(num-i))
                    System.out.println(num + " = "+ (num-i) + " + "+ i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number : ");
        find(scanner.nextInt());
    }
}
