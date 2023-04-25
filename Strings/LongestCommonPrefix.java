/**
 * LongestCommonPrefix :-
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str){
        Arrays.sort(str);
        String result = "";
        char[] first = str[0].toCharArray();
        char[] last = str[str.length-1].toCharArray();
        for(int i = 0 ; i <  first.length ; i++){
            if(first[i] != last[i]) {
                break;
            }
            result = result + first[i];
        }
        return result;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
