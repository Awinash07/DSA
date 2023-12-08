package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {
    public static int maxFruitCountOfTwoTypes(char[] arr){
        if(arr == null) throw new IllegalArgumentException();
        Map<Character,Integer> fruitCountMap = new HashMap<>();
        int maxLength = 0;
        int windowStart = 0;
        for(int windowEnd = 0 ; windowEnd < arr.length ; windowEnd++){
            char rightChar = arr[windowEnd];
            fruitCountMap.put(rightChar,fruitCountMap.getOrDefault(rightChar , 0)+1);
            while(fruitCountMap.size() > 2){
                char leftChar = arr[windowStart];
                fruitCountMap.put(leftChar, fruitCountMap.get(leftChar) - 1);
                if(fruitCountMap.get(leftChar) == 0) fruitCountMap.remove(leftChar);
                windowStart++;
            }
            maxLength = Math.max(maxLength,windowEnd - windowStart + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println("Maximum number of fruits: " + maxFruitCountOfTwoTypes(new char[] { 'A', 'B', 'C', 'A', 'C' }));
        System.out.println("Maximum number of fruits: " + maxFruitCountOfTwoTypes(new char[] { 'A', 'B', 'C', 'B', 'B', 'C' }));
    }

}
