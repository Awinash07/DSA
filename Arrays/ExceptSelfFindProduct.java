/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]*/

package Arrays;

public class ExceptSelfFindProduct {

    public static int[] productExceptSelf(int nums[]){
        int runningProduct = 1;
        int result[] = new int[nums.length];
        //left pass
        for(int i =0 ;i< nums.length;i++){
            result[i] = runningProduct;
            runningProduct = runningProduct * nums[i];
        }
        runningProduct = 1;
        for(int i = nums.length -1 ; i>= 0 ; i--){
            result[i] = runningProduct * result[i];
            runningProduct = runningProduct * nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int result[] = productExceptSelf(nums);
        for(int i : result){
            System.out.println(i);
        }

    }
}
