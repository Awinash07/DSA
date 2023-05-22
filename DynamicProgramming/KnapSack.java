package DynamicProgramming;

public class KnapSack {
    public static int knapsack(int[] weights, int[] values , int capacity) {
        int[][] dp =  new int[weights.length + 1][capacity + 1];
        for(int i = 0 ; i <= weights.length; i++){
            for(int w = 0; w <= capacity ; w++){
                if(i == 0 || w == 0){
                    dp[i][w] = 0;
                }else if(weights[i - 1] <= w){
                    dp[i][w] = Math.max(values[i - 1] + dp[i-1][w - weights[i - 1]], dp[i-1][w]);
                }else{
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[weights.length][capacity];
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;

        int maxValue = knapsack(weights, values, capacity);
        System.out.println("Maximum value: " + maxValue);
    }
}