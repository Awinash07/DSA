package TwoPointers;

import java.util.HashMap;

public class TwoSumHashTable {
    public int[] twoSumUsingHashTable(int[] arr, int targetSum){
        HashMap<Integer, Integer> nums = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            if(nums.containsKey(targetSum - arr[i])){
                return new int[] {i,nums.get(targetSum - arr[i])};
            }else{
                nums.put(arr[i], i);
            }
        }
        return new int[] {-1, -1};
    }
}
