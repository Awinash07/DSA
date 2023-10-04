/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 *
 * Input: s = "rat", t = "car"
 * Output: false
 */

package Strings;

public class IsAnagram {
    public static void main(String[] args) {
        String a = "nagaram";
        String b = "anagram";
        boolean ans = isAnagram(a,b);
        System.out.println(ans);
    }

    private static boolean isAnagram(String a, String b) {
        int[] al = new int[256];
        int[] bl = new int[256];
        int index;
        for(char ch : a.toCharArray()){
            index = ch;
            al[index]++;
        }
        for(char ch : b.toCharArray()){
            index = ch;
            bl[index]++;
        }
        for(int i=0 ; i < 256 ; i++){
            if(al[i] != bl[i]) return false;
        }
        return true;
    }
}















