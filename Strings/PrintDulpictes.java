/**
 * printDulpictes
 *
 * Write an efficient program to print all the duplicates and their counts in the input string
 */

package Strings;

import java.util.HashMap;
import java.util.Map;

public class PrintDulpictes {
    public static Map<Character,Integer> printDuplicates(String str){
        HashMap<Character, Integer> result = new HashMap<>();
        char[] charArray = str.toCharArray();
        for(int i = 0; i< charArray.length;i++){
            if(result.containsKey(charArray[i])){
                int count = result.get(charArray[i]);
                result.put(charArray[i],count+1);
            }else{
                result.put(charArray[i],1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str =  "aaabbbbbsssssccccc";
        Map<Character, Integer> result = printDuplicates(str);
        System.out.println(result);
    }

}
