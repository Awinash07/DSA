/**
 * Indian Coins
 *
 * we are given an infinite supply of denominations[1, 2, 5, 10, 20, 50, 100, 500, 2000]
 * find min no.of coins/notes to make change for a value V.
 *
 * V = 121
 * ans = 3(100+20+1);
 * V = 590
 * ans = 4(500+50+20+20 )
 */

package Greedy;

import java.util.ArrayList;
import java.util.Arrays;


public class IndianCoins {
    public static ArrayList<Integer> ans = new ArrayList<>();
    public static int coinCount(int coins[],int amount){
        Arrays.sort(coins);
        int coinsCount = 0;
        for(int i = coins.length - 1 ; i >= 0 ; i--){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    coinsCount++;
                    ans.add(coins[i]);
                    amount = amount - coins[i];
                }
            }
        }
        return coinsCount;
    }

    public static void main(String[] args) {
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 590;
        int coinCount = coinCount(coins, amount);
        System.out.println(ans+","+coinCount);
    }
}
