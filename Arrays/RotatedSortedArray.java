//There is an integer array nums sorted in ascending order (with distinct values).
// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
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
    public static int rotatedSortedArrayBinarySearch(int nums[], int target){
        int high = nums.length - 1;
        int low = 0 ;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > nums[low]){
                if(nums[low] < target && nums[mid] > target){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }

            }else{
                if(target > nums[mid] && target < nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 2;
        //int result = rotatedSortedArray(nums, target);
        int resultBT = rotatedSortedArrayBinarySearch(nums, target);
        System.out.println(resultBT);
    }
    
}
