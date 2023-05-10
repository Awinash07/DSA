/**
 * 1208. Get Equal Substrings Within Budget
 *
 * You are given two strings s and t of the same length and an integer maxCost.
 * You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]| (i.e., the absolute difference between the ASCII values of the characters).
 * Return the maximum length of a substring of s that can be changed to be the same as the corresponding substring of t with a cost less than or equal to maxCost. If there is no substring from s that can be changed to its corresponding substring from t, return 0.
 *
 * Example 1:
 *
 * Input: s = "abcd", t = "bcdf", maxCost = 3
 * Output: 3
 * Explanation: "abc" of s can change to "bcd".
 * That costs 3, so the maximum length is 3.
 * Example 2:
 *
 * Input: s = "abcd", t = "cdef", maxCost = 3
 * Output: 1
 * Explanation: Each character in s costs 2 to change to character in t,  so the maximum length is 1.
 *
 */
package SlidingWindow;

public class EqualSubstring {
    public static int equalSubstring(String s, String t, int maxCost) {
        int head = 0, tail = 0, ans =0, cost = 0;
        for(head = 0; head < s.length(); head++){
            cost = cost + Math.abs((int)s.charAt(head) - (int)t.charAt(head));
            while(cost > maxCost){
                cost = cost - Math.abs((int)s.charAt(tail) - (int)t.charAt(tail));
                tail++;
            }
            ans = Math.max(ans, head - tail + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        System.out.println(equalSubstring(s,t,maxCost));
    }
}
