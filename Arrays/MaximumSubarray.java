//Given an integer array nums, find the subarray with the largest sum, and return its sum.

/*Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6. */
/**
 * @implNote traverse through array add nos, if sum becomes -ve then restart adding from next no(use Kadane's Algorithm).
 * 
 * @author Awinash   
 */
package Arrays;

public class MaximumSubarray {

    public int maxSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int negativeSum = Integer.MIN_VALUE;

        if(arr.length == 1){
            maxSum = arr[0];
            return maxSum;
        }
        for(int i = 0; i < arr.length; i++){
            currSum = currSum + arr[i];
            maxSum = Math.max(currSum, maxSum);

            if(currSum < 0){
                negativeSum = Math.max(negativeSum, currSum);
                currSum = 0;
            }
        }
        maxSum = Math.max(maxSum, negativeSum);
        return maxSum;
    }
    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray(); 
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int nums[] = {-1,-2};
        int nums2[] ={1};
        int maxSum = maximumSubarray.maxSubArray(nums2);
        System.out.println(maxSum);
    }
    
}
