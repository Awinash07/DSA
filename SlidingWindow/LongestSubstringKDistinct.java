package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {
    public static int findLength(String str, int k) {
        if(str.length() < k || str == null || str.length() == 0) throw new IllegalArgumentException();
        int windowStart = 0;
        int maxLength = Integer.MIN_VALUE;
        Map<Character, Integer> distintCharCountMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            distintCharCountMap.put(rightChar, distintCharCountMap.getOrDefault(rightChar, 0) + 1);
            while (distintCharCountMap.size() > k) {
                char leftChar = str.charAt(windowStart);
                distintCharCountMap.put(leftChar, distintCharCountMap.get(leftChar) - 1);
                if (distintCharCountMap.get(leftChar) == 0) {
                    distintCharCountMap.remove(leftChar);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + findLength("cbbebi", 3));
    }
}
