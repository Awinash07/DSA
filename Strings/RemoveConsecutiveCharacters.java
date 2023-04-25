/**
 * Input:
 * S = aabaa
 * Output:  aba
 * Explanation: 'a' at 2nd position is
 * appearing 2nd time consecutively.
 * 'a' at fifth position is appearing
 * 2nd time consecutively.
 */

package Strings;

public class RemoveConsecutiveCharacters {
    public static String removeConsecutiveChar(String s){
        String result = "";
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(i < n-1 && s.charAt(i) == s.charAt(i+1)){
                continue;
            }else{
                result = result + s.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "aaabbbbccccc";
        String res = removeConsecutiveChar(s);
        System.out.println(res);
    }
}
