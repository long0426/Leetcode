package long0426.example.leetcode.easy;

/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 *
 * Could you solve it without converting the integer to a string?
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(122));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int i = x;
        int j = 0;
        while (i > 0) {
            j = j * 10 + i % 10;
            i = i / 10;
        }
        return x == j;
    }
}
