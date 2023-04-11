/*You are given n activity with their start and end times .
select the maximum number of activities that can be performed by a single person,
assuming that a person can only work on a single activity at a time . Activities are sorted according to end time
start = [10, 20, 30]
end = [20, 25, 30]
ans = 2(A0 & A2)*/

package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    /**
     * activitySelectionNotSorted :- This method will be used to find max activity when end time is not sorted
     * @param start
     * @param end
     * @return
     */
    public static ArrayList<Integer> activitySelectionNotSorted(int[] start , int end[]){
        int activities[][] = new int[start.length][3];
        for(int i = 0; i < start.length; i++){
            activities[i][0] =  i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        ArrayList<Integer> ans = new ArrayList<>();
        int maxActivity = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i = 0 ; i < start.length; i++){
            if(activities[i][1] >= lastEnd){
                maxActivity++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println(maxActivity);
        return ans;
    }
    /**
     * activitySelectionSorted : This method will be used to find max activity when end time is sorted.
     * @param start
     * @param end
     * @return
     */
    public static ArrayList<Integer> activitySelectionSorted(int[] start, int[] end){
        ArrayList<Integer> ans = new ArrayList<>();
        int maxActivity = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=0; i < start.length; i++){
            if(start[i] >= lastEnd){
                maxActivity++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println(maxActivity);
        return ans;
    }

    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        ArrayList<Integer> ans = activitySelectionNotSorted(start, end);
        System.out.println(ans);
    }
}
