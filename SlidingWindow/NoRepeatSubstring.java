package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring{
    public static int findLength(String str){
        if(str.equals(null)) throw new IllegalArgumentException();
        Map<Character,Integer> characterCountMap = new HashMap<>();
        int windowStart = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);
            //if the map already contains the 'rightChar', shrink the window from the beginning so that
            // we have only one occurrence of 'rightChar'
            if(characterCountMap.containsKey(rightChar)){
                // this is tricky; in the current window, we will not have any 'rightChar' after its previous index
                // and if 'windowStart' is already ahead of the last index of 'rightChar', we'll keep 'windowStart'
                windowStart = Math.max(windowStart, characterCountMap.get(rightChar) + 1);
            }
            characterCountMap.put(rightChar,windowEnd);
            maxLength = Math.max(maxLength,windowEnd - windowStart + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + findLength("aabccbb"));
        System.out.println("Length of the longest substring: " + findLength("abbbb"));
        System.out.println("Length of the longest substring: " + findLength("abccde"));
    }
}
