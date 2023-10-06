/*ques no 53/647- Palindromic Substring count 

Given a string str of length N, you have to find number of palindromic subsequence (need not necessarily be distinct) present in the string str.
Note: You have to return the answer module 109+7;
*/

package DynamicProgramming;

public class PalindromicSubStringCount {
    public int getCount(String str){
        int count = 0;
        boolean[][] dp = new boolean[str.length()][str.length()];
        for(int g = 0 ; g <str.length(); g++){
            for(int i = 0, j = i+g; j < str.length(); i++,j++){
                if(g == 0){
                    dp[i][j] = true;
                }else if(g == 1){
                    if(str.charAt(i) == str.charAt(j)){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }else{
                    if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }
                if(dp[i][j] == true){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        String str = "aab";
        PalindromicSubStringCount palindromicSubStringCount = new PalindromicSubStringCount();
        int count = palindromicSubStringCount.getCount(str);
        System.out.println(count);
    }
}
