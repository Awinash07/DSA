/*
 * QNo - 50/5 Longest Palindromic Substring
 * 
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * 
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 * 
 */
package DynamicProgramming;

public class LongestPalindromicSubstring {
    public String longestPalindromicSubstring(String s){
        String longestString = "";
        int maxLen = 0; 
        boolean[][] dp = new boolean[s.length()][s.length()];
        for(int g = 0 ; g < s.length(); g++){
            for(int i = 0, j = i+g ; j < s.length(); i++,j++){
                if(g == 0){
                    dp[i][j] = true;
                }else if(g == 1){
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j]){
                    longestString = s.substring(i, j+1);
                    maxLen = j;
                }
            }
        }
        System.out.println(maxLen);
        return longestString;
    }
    public static void main(String[] args){
        String str = "cbbd";
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String string = longestPalindromicSubstring.longestPalindromicSubstring(str);
        System.out.println(string);
    }    
}
