package TwoPointers;

public class TwoSum {
    public int[] targetedSum(int[] arr, int targetedSum){
        int left = 0;
        int right = arr.length - 1;
        int[] result = null;
        while(right > left){
            int sum = arr[right] + arr[left];
            if(sum == targetedSum){
                return new int[] { left, right };
            }
            if(sum < targetedSum) left++;
            if(sum > targetedSum) right--;
        }
        return result;
    }
}
