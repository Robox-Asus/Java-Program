import java.util.Scanner;

// Palindrome
// 1. Malayalam - Palindrome
// 2. Gagana - Not Palindrome
public class Palindrome {
    static boolean IsPalindrome(String input, int start, int end) {
        if(start > end/2)
        {
            return false;
        }
        if(start == end - start - 1 || start == end - start)
        {
            return true;
        }
        if(input.charAt(start) == input.charAt(end - start - 1))
        {
            return IsPalindrome(input,start + 1,end);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the String : ");
        String input = scanner.nextLine().toLowerCase();
        boolean result = IsPalindrome(input,0,input.length());
        System.out.println(input+((result)?" : Palindrome":" : Not Palindrome"));
    }
}
