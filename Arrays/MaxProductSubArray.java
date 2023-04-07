/*Given an integer array nums, find a subarray
 that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.*/

package Arrays;

public class MaxProductSubArray {

    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] < 0){
                int temp = minProduct;
                minProduct = maxProduct;
                maxProduct = temp;
            }
            maxProduct = Math.max(maxProduct*nums[i],nums[i]);
            minProduct = Math.min(minProduct*nums[i],nums[i]);
            result = Math.max(result, maxProduct);

        }
        return result;
    }
    public static void main(String[] args) {

        int[] nums = {2,3,-2,4};
        int result = maxProduct(nums);
        System.out.println(result);
    }
}
