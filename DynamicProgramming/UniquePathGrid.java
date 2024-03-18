package DynamicProgramming;

import java.util.Arrays;

public class UniquePathGrid {
    public static int uniquePath(int i, int j, int[][] dp)
    {
        if(i == 0 && j == 0 ) return 1;

        if(i < 0 || j < 0) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int up = uniquePath(i - 1, j,dp);
        int left = uniquePath(i,j - 1,dp);

        return dp[i][j] = up + left;
    }

    public static int uniquePathHelper(int i, int j)
    {
        int[][] dp = new int[i+1][j+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return uniquePath(i-1,j-1,dp);

    }

    public static void main(String args[]) {
        int m = 3;
        int n = 2;

        // Call the countWays function and print the result
        System.out.println(uniquePathHelper(m, n));
    }

}
