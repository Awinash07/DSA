package DynamicProgramming;

public class UnboundedKnapsack {

    public static int unboundedKnapsack(int[] values, int[] weights, int capacity){
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        for(int i = 0; i <= n; i++){
            for(int w = 0 ; w <= capacity; w++){
                if(i == 0 || w == 0 ){
                    dp[i][w] = 0;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] values = {10, 30, 20};
        int[] weights = {5, 10, 15};
        int capacity = 100;
        int maxKnapsackValue = unboundedKnapsack(values, weights, capacity);
        System.out.println("Maximum Knapsack Value: " + maxKnapsackValue);
    }

}
