/*Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct. 
 
 Input: nums = [1,2,3,1]

 Output: true  */

package Arrays;

import java.util.Arrays;

public class ContainsDuplicates {

    public static boolean containsDuplicates(int nums[]){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        boolean value = containsDuplicates(nums);
        System.out.println(value);
    }
}
