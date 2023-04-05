//There is an integer array nums sorted in ascending order (with distinct values).

/*
 * Input: nums = [4,5,6,7,0,1,2], target = 0
   Output: 4
 */

package Arrays;

public class RotatedSortedArray {

    public static int rotatedSortedArray(int nums[], int target){
        int start = 0;
        int end = nums.length; 
        while(end > start){
            if(nums[start] == target) return start;
            start++;
        }
        return -1;
    } 

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        int result = rotatedSortedArray(nums, target);
        System.out.println(result);
    }
    
}
