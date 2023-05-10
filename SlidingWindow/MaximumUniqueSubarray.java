/**
 * 1695. Maximum Erasure Value
 *
 * You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.
 * Return the maximum score you can get by erasing exactly one subarray.
 *
 * Example 1:
 * Input: nums = [4,2,4,5,6]
 * Output: 17
 * Explanation: The optimal subarray here is [2,4,5,6].
 *
 * Example 2:
 * Input: nums = [5,2,1,2,5,2,1,2,5]
 * Output: 8
 * Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
 */

package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaximumUniqueSubarray {

    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int head = 0 , tail = 0 , ans = 0, sum = 0;
        for(head = 0 ; head < nums.length ; head++){
            while(!set.add(nums[head])) {
                ans = Math.max(ans,sum);
                sum = sum - nums[tail];
                set.remove(nums[tail]);
                tail++;
            }
            sum = sum + nums[head];
        }
        return Math.max(ans,sum);
    }
    public static void main(String[] args) {
        int nums[] = {5,2,1,2,5,2,1,2,5};
        int ans = maximumUniqueSubarray(nums);
        System.out.println(ans);
    }
}
