/*Given an array of N integers where each value represents the number of chocolates in a packet. 
Each packet can have a variable number of chocolates. There are m students, 
the task is to distribute chocolate packets such that: 

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and 
the packet with minimum chocolates given to the students is minimum. 

Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
Output: Minimum Difference is 2 

Explanation:
We have seven packets of chocolates and we need to pick three packets for 3 students 
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
Output: Minimum Difference is 6 */

package Arrays;

import java.util.Arrays;

public class findMinDiff {

    public static int minDiff(int nums[], int noOfStudents, int noOfPackets){

        if(noOfStudents > noOfPackets) return -1;
        if(noOfPackets == 0 || noOfStudents == 0) return 0;

        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0 ; i+noOfStudents-1 < noOfPackets ; i++){
            int diff = nums[i+noOfStudents-1] - nums[i];
            minDiff = Math.min(minDiff, diff);  
        }
        return minDiff;
    }

    public static void main(String args[]){

        int nums[] = {7, 3, 2, 4, 9, 12, 56};
        int noOfStudents = 3 ;
        int noOfPackets = nums.length;
        int diff = minDiff(nums,noOfStudents,noOfPackets);
        System.out.println(diff);
    }    
}
