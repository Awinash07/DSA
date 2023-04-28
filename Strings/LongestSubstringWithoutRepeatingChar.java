/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 */


package Strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {

    public static int longestString(String s) {
        int maxLenght = 0;
        Map<Character,Integer> visitedcharacters = new HashMap<>();
        char[] chars = s.toCharArray();
        for(int right = 0, left = 0; right < chars.length; right++){
            char currentChar = chars[right];
            if(visitedcharacters.containsKey(currentChar)){
                left = visitedcharacters.get(chars[right]) + 1;
            }else{
                visitedcharacters.put(chars[right], right);
                maxLenght = Math.max(maxLenght, right-left + 1);
            }
        }
        return maxLenght;

    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestString(str));
    }

}
