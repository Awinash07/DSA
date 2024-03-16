package DynamicProgramming;

import java.util.Arrays;

public class KnapsackMemoization {

    // Initializing memoization array with -1
    static int dp[][];

    public static int knapsack(int[] weights, int[] values, int capacity, int n )
    {
        // Base Case
        if(capacity == 0 || n == 0) return 0;

        // If the result is already computed, return it
        if(dp[n][capacity] != -1) return dp[n][capacity];

        if(weights[n-1] > capacity){
            return dp[n][capacity] = knapsack(weights, values, capacity, n-1);
        }
        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
        else
        {
            return dp[n][capacity] = Math.max(values[n-1] + knapsack(weights, values, capacity - 1, n - 1),
                                                            knapsack(weights, values, capacity, n - 1));
        }

    }

    public static void main(String[] args) {

        int[] values = { 60, 100, 120 };
        int[] weights = { 10, 20, 30 };
        int capacity = 50;
        int n = values.length;


        dp = new int[n+1][capacity+1];

        for(int i = 0; i < dp.length; i++)
        {
            Arrays.fill(dp[i], -1);
        }
        System.out.println("Maximum value that can be obtained: " + knapsack(weights, values, capacity, n));

    }

}
