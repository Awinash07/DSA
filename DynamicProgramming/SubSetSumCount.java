package DynamicProgramming;

public class SubSetSumCount {

    public static int countSubsets(int sum, int[] nums){
        int n = nums.length;
        int[][] dp = new int[n+1][sum+1];
        for(int i = 0; i <= n; i++){
            dp[i][0] = 1;
        }
        for(int i = 1 ; i <= n; i++){
            for(int w = 1 ; w <= sum ; w++){
                if(w >= nums[i - 1]){\
                    dp[i][w] = dp[i - 1][w] + dp[i - 1][w - nums[i-1]];
                }else{
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8};
        int targetSum = 10;
        int count = countSubsets(targetSum, nums);
        System.out.println("Count of subsets with sum " + targetSum + ": " + count);
    }
}
