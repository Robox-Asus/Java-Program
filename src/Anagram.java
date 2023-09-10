// Anagram means words that can be formed by rearranging them
// rasp can be pars

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string in console : ");
        String input1 = scanner.nextLine();
        System.out.print("Enter second string in console : ");
        String input2 = scanner.nextLine();
        anagram(input1,input2);

    }

    private static void anagram(String s1, String s2) {
        if(s1.length() == s2.length()) {
            char[] input_1 = s1.toCharArray();
            char[] input_2 = s2.toCharArray();
            Arrays.sort(input_1);
            Arrays.sort(input_2);

            boolean result = Arrays.equals(input_1,input_2);
           System.out.println(s1 + " - " + s2 + " = " + (result ? "Anagram" : "Not Anagram") );
        }
    }
}

