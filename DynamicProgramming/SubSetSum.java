package DynamicProgramming;

public class SubSetSum {
    public static boolean subsetSum(int[] nums, int target){
        int n = nums.length;
        boolean[][] v = new boolean[n + 1][target +1];
        for(int i = 0 ; i<= n ; i++){
            v[i][0] = true;
        }
        for(int i = 1; i <= n ; i++){
            for(int sum = 1 ; sum <= target; sum++){
                if( sum - nums[i - 1] >= 0){
                    v[i][sum]  = v[i - 1][sum] || v[i - 1][sum - nums[i - 1]];
                }else{
                    v[i][sum] = v[i - 1][sum];
                }
            }
        }
        return v[n][target];
    }
    public static void main(String[] args) {

        int[] nums = {2, 3, 7, 8, 10};
        int target = 12;
        boolean hasSubsetSum = subsetSum(nums, target);
        System.out.println("Has subset sum: " + hasSubsetSum);

    }
}