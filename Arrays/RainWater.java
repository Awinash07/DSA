/*
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 */

package Arrays;

public class RainWater {

    public static int rainWaterTrapping(int arr[]){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        for(int i = 1 ; i < n; i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        right[n-1] = arr[n-1];
        for(int i = n-2; i > 0; i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(left[i], right[i]);
            if(waterLevel >= arr[i]){
                ans = ans + (waterLevel - arr[i]);
            }
        }
        return ans;

    }
    public static void main(String[] args) {

        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = rainWaterTrapping(height);
        System.out.println(ans);
    }
}
