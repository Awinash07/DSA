/**
 *Max Length Chain of Pairs :-
 *
 * You are given n pairs of numbers. in every pair, yhe first number is always smaller than the second number.A pair
 * (c,d) can come after pair (a,b) if b<c.
 * find the longest chain which can be formed from a given set of pairs.
 *
 * pair = {{5,24},{39,60},{5,28},{27,40},{50,90}}
 * ans = 3
 *
 */

package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class PairSelection {

    public static int maxChain(int[][] pair){
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));
        int chainLen = 1;
        int chainEnd = pair[0][1];
        for(int i = 1 ;i < pair.length; i++){
            if(pair[i][0] > chainEnd){
                chainLen++;
                chainEnd = pair[i][1];
            }
        }
        return chainLen;
    }

    public static void main(String[] args) {
       int[][] pair = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        int ans = maxChain(pair);
        System.out.println("maximum len of chain"+"="+ans);
    }
}
