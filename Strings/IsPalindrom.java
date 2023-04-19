/**
 * Valid Palindrome :-
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 */

package Strings;

public class IsPalindrom {
    public static void main(String[] args) {
        String s = "amanaplanacanalpanama";
        boolean ans =  isPalindrom(s);
        System.out.println(ans);
    }

    private static boolean isPalindrom(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return  false;
            }
            start++;
            end--;
        }
        return true;
    }
}
