/**
 * Created by gaowei16 on 17/5/3.
 * Desc:Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 */
public class No5LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return s;
        int maxLength = 1;
        int front = 0;
        int back = 0;
        for (int i = 1; i < s.length() - maxLength / 2; i++) {
            int j = 1;
            int length = 1;
            //子字符串长度为奇数
            while (i - j >= 0 && i + j < s.length() && s.charAt(i - j) == s.charAt(i + j)) {
                j++;
                length += 2;
            }
            length -= 2;
            if (length > maxLength) {
                maxLength = length;
                front = i - --j;
                back = i + j;
            }
            j = 1;
            length = 0;
            //子字符串长度为偶数
            while (i - j >= 0 && i + j - 1< s.length() && s.charAt(i - j) == s.charAt(i + j - 1)) {
                j++;
                length += 2;
            }
            length -= 2;
            if (length > maxLength) {
                maxLength = length;
                front = i - --j;
                back = i + j - 1;
            }
        }
        return s.substring(front, back + 1);
    }

    public static void main(String[] args) {
        String s = "bcabbd";
        System.out.println(new No5LongestPalindromicSubstring().longestPalindrome(s));
    }
}
