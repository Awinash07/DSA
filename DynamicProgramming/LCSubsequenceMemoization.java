package DynamicProgramming;

import java.util.Arrays;

public class LCSubsequenceMemoization {

    //time complexity : O(m*n)
    //space complexity : O(m*n)
    public static int lcs(String str1, String str2)
    {
        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n+1][m+1];
        for(int[] row : dp) Arrays.fill(row, -1);

        return lcsHelper(str1,str2,n,m, dp);
    }

    private static int lcsHelper(String str1, String str2, int n, int m, int[][] dp)
    {
        if(n == 0 || m == 0) return 0;

        if(dp[n][m] != -1) return dp[n][m];

        if(str1.charAt(n - 1) == str2.charAt(m - 1))
            return dp[n][m] =  1 + lcsHelper(str1, str2, n - 1, m - 1, dp);
        else
        {
            return dp[n][m] =  Math.max(lcsHelper(str1, str2, n - 1, m, dp), lcsHelper(str1, str2, n , m - 1, dp));
        }
    }

    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println("Length of the Longest Common Subsequence: " + lcs(text1, text2));
    }
}
