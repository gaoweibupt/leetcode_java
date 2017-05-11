/**
 * Created by gaowei16 on 17/5/10.
 * @desc Implement regular expression matching with support for '.' and '*'.
 */
public class No10RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*' && dp[0][i-1]) {
                dp[0][i+1] = true;
            }
        }
        for (int i = 0 ; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '.') {
                    dp[i+1][j+1] = dp[i][j];
                }
                if (p.charAt(j) == s.charAt(i)) {
                    dp[i+1][j+1] = dp[i][j];
                }
                if (p.charAt(j) == '*') {
                    if (p.charAt(j-1) != s.charAt(i) && p.charAt(j-1) != '.') {
                        dp[i+1][j+1] = dp[i+1][j-1];
                    } else {
                        dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String args[]) {

        System.out.println(new No10RegularExpressionMatching().isMatch("aa","a*"));
        System.out.println(new No10RegularExpressionMatching().isMatch("aa","aa"));

        System.out.println(new No10RegularExpressionMatching().isMatch("aaa","aa"));

        System.out.println(new No10RegularExpressionMatching().isMatch("aa", ".*c"));

        System.out.println(new No10RegularExpressionMatching().isMatch("aab", "c*a*b"));

    }
}
