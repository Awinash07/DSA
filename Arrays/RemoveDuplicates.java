package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
                count++;
            }else{
                continue;
            }
        }
        return count;
    }

    /*using hash set
    Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        return set.size(); */
    
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
}
