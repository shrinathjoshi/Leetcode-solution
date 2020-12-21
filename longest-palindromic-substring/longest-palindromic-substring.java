class Solution {
    public String longestPalindrome(String s) {
    
        if (s == null || s.length() <= 1)
            return s;
​
        int n = s.length();
​
        int maxLength = 0;
        int maxStart = 0;
        int maxEnd = 0;
​
        boolean[][] dp = new boolean[n][n];
​
        for (int i = 0; i < n; i++)
            dp[i][i] = true;
        int j = 0;
        for (int l = 1; l <= n; l++) {
            for (int i = 0; i <= n - l; i++) {
                j = i + l - 1;
​
                if (l <= 2 && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = true;
                } else if (s.charAt(i) == s.charAt(j))
                    dp[i][j] = dp[i + 1][j - 1];
​
                if (dp[i][j] && maxLength < j - i + 1) {
                    maxLength = j - i + 1;
                    maxStart = i;
                    maxEnd = j;
                }
            }
        }
​
        return s.substring(maxStart, maxEnd + 1);
    }
}
​
// babad
// dabab
