/**
 * Fractinal Knapsack
 *
 * Given the weights and values of n items , put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
 * values[60,100,120]
 * weight [10,20,30]
 * W = 50
 */

package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static double fractionalKnapsack(int[] value, int[] weight, int capcityWeight){
        double[][] ratio = new  double[value.length][2];
        for(int i = 0; i < value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        double finalValue = 0;
        for(int j = ratio.length-1 ; j >= 0 ; j--){
            int idx = (int)ratio[j][0];
            if(capcityWeight >= weight[idx]){
                //include full item
                finalValue = finalValue + value[idx];
                capcityWeight = capcityWeight - weight[idx];
            }else{
                //include fractional item
                finalValue = finalValue + (ratio[j][1] * capcityWeight);
                break;
            }
        }
        return finalValue;
    }

    public static void main(String[] args){

        int value[] = {60,100,120};
        int weight[] = {10,20,30};
        int capacityWeight = 50;
        double ans = fractionalKnapsack(value,weight,capacityWeight);
        System.out.println(ans);
    }

}
