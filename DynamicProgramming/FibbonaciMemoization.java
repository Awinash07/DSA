package DynamicProgramming;

import java.util.Arrays;

public class FibbonaciMemoization {
    static int[] dp;
    public static int fib(int n)
    {
        if(dp[n] != -1) return dp[n];

        if(n <= 1)
            dp[n] = n;
        else
            dp[n] = fib(n-1) + fib(n - 2);

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        dp = new int[n+1];
        for(int i = 0; i < n ; i++){
            Arrays.fill(dp,-1);
        }
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }
}
