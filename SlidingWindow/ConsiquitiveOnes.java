/**
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * Example 1:
 *
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 * Example 2:
 *
 * Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */
package SlidingWindow;

public class ConsiquitiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int head , tail = 0 ;
        int ans = 0;
        for(head = 0 ;head < nums.length; head++) {
            if(nums[head] == 0) k--;
            while(k < 0){
                if(nums[tail] == 0){
                    k++;
                }
                tail++;
                ans = Math.max(ans,head - tail + 1);
            }
        }
        return Math.max(ans,head - tail);
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums,k));
    }
}

