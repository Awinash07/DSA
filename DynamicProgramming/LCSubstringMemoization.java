package DynamicProgramming;

import java.util.Arrays;

public class LCSubstringMemoization {

    static int[][] dp;
    public static int lcs(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        dp = new int[n+1][m+1];
        for(int[] row : dp) Arrays.fill(row, -1);

        int maxlen = 0;

        for(int i = 0 ; i <= n; i++)
        {
            for(int j = 0 ; j <= m; j++)
            {
                if(i == 0 || j == 0)
                {
                    dp[i][j] = 0;
                }
                else if(str1.charAt(i-1) == str2.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    maxlen = Math.max(maxlen,dp[i][j]);
                }
                else
                {
                    dp[i][j] = 0;
                }
            }
        }
        return maxlen;

    }

    public static void main(String[] args) {
        String text1 = "abcdxyz";
        String text2 = "xyzabcd";
        System.out.println("Length of the Longest Common Substring: " + lcs(text1, text2));
    }
}
