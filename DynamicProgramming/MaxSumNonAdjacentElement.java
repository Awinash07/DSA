package DynamicProgramming;

import java.util.Arrays;

public class MaxSumNonAdjacentElement {

    public static int maxSumNonAdjacentElement(int[] nums)
    {
        if(nums.length == 0)
            return 0;

        int[] dp = new int[nums.length + 1];
        for(int i = 0 ; i < nums.length; i++){
            Arrays.fill(dp,-1);
        }
        return maxSumNonAdjacentElement(nums, nums.length - 1, dp);
    }
    public static int maxSumNonAdjacentElement(int[] nums, int n, int[] dp)
    {
        if(n < 0) return 0;

        if(dp[n] != -1) return dp[n];


        // At each step, we have two options:
        // 1. Include the current element and add it to the sum of non-adjacent elements two positions back.
        // 2. Exclude the current element and keep the sum of non-adjacent elements from the previous position.
        // We choose the maximum of these two options.
        int include = nums[n] + maxSumNonAdjacentElement(nums,n-2,dp);
        int exclude = maxSumNonAdjacentElement(nums, n-1,dp);

        dp[n] = Math.max(include,exclude);
        return dp[n];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1, 5}; // Example array
        System.out.println("Maximum sum of non-adjacent elements: " + maxSumNonAdjacentElement(nums));
    }
}
