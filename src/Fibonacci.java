// Fibonacci Series -- 0 1 1 2 3 5


import java.util.Scanner;

public class Fibonacci {

    static int fibonacciSeries(int input,int start,int extra) {
        if(input-- > 0) {
            System.out.print(start + " ");
           return fibonacciSeries(input,start+extra,start);
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the Number to get Fibonacci Series : ");
        fibonacciSeries(scanner.nextInt(),0,1);
    }
}
