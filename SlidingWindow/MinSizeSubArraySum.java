package SlidingWindow;

public class MinSizeSubArraySum{
    public static int findMinSubArray(int sum, int[] arr){
        int windowStart = 0;
        int windowSum = 0;
        int minWindowSize = Integer.MAX_VALUE;
        for(int windowEnd = 0 ; windowEnd < arr.length ; windowEnd++){
            windowSum += arr[windowEnd];
            while(windowSum >= sum){
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart+1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minWindowSize;
    }
    public static void main(String[] args) {
        System.out.println("Smallest subarray length: " + findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 }));
        System.out.println("Smallest subarray length: " + findMinSubArray(7, new int[] { 2, 1, 5, 2, 8 }));
        System.out.println("Smallest subarray length: " + findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 }));
    }

}
