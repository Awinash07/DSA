package DynamicProgramming;

public class EqualSumPartion {
    public static boolean equalSumPartion(int[] nums){
        int totalSum = 0 ;
        int n = nums.length;
        for(int num : nums){
            totalSum += num;
        }
        if(totalSum % 2 != 0){
            return false;
        }
        int targetSum = totalSum / 2;
        boolean[][] dp = new boolean[n + 1][targetSum + 1];
        for(int i = 0 ; i<= n; i++){
            dp[i][0] = true;
        }
        for(int i = 1; i <= n ;i++){
            for(int w = 1 ; w <= targetSum ; w++){
                if (w - nums[i - 1] >= 0) {
                    dp[i][w] = dp[i - 1][w] || dp[i - 1][w - nums[i - 1]];
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][targetSum];
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        boolean result = equalSumPartion(nums);
        System.out.println("Can be partitioned into equal sum subsets: " + result);

    }
}
