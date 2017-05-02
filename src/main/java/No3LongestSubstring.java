/**
 * Created by gaowei16 on 17/5/1.
 * Desc:Given a string, find the length of the longest substring without repeating characters.
 */
public class No3LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        if (s.length() == 1) {
            return 1;
        }
        int maxLength = 0;
        int length = 0;
        int front = 0;
        int back = 1;
        while (back < s.length()) {
            for (int i = front; i < back; i++) {
                if (s.charAt(i) == s.charAt(back)) {
                    front = i + 1;
                }
            }
            length = back - front + 1;
            if (length > maxLength)
                maxLength = length;
            back ++;
        }
        return maxLength;
    }
}
