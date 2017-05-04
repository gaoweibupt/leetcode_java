/**
 * Created by gaowei on 2017/5/5.
 * Desc: Determine whether an integer is a palindrome. Do this without extra space.
 */
public class No9PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;
        int y = 0;
        while (x > y) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        if (x == y || x == y / 10)
            return true;
        else
            return false;
    }
}
