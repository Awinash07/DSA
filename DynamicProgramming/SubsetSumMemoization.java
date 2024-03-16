package DynamicProgramming;

import java.util.Arrays;

public class SubsetSumMemoization {
    static boolean[][] dp;
    public static boolean subsetSum(int[] arr, int sum, int n)
    {
        if(sum == 0) return true;

        if(n == 0) return false;

        if(dp[n][sum] != false) return dp[n][sum];

        if(arr[n - 1] > sum)
        {
            return dp[n][sum] = (subsetSum(arr, sum, n - 1));
        }
        else
        {
            return dp[n][sum] = (subsetSum(arr, sum, n - 1)) || (subsetSum(arr, sum - arr[n-1],n-1));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = arr.length;

        dp = new boolean[n+1][sum+1];

        for(boolean[] row : dp){
            Arrays.fill(row, false);
        }

        if (subsetSum(arr, sum, n))
            System.out.println("Subset with the given sum exists.");
        else
            System.out.println("No subset with the given sum exists.");

    }
}
