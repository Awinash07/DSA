package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FindTargetSum {
   public static int[] findSum(int[] arr, int target){
    int[] result = new int[2];
    for(int i = 0; i <= arr.length ; i++){
        for(int j = i; j <= arr.length-1; j++){
            int sum = arr[i]+arr[j];
            if(sum == target){
                result[0] = i;
                result[1] = j;
                return result;
            }   
        }     
    }
    return result;
}
public static int[] findSumUsingHashing(int[] arr, int target){
    int[] result = new int[2];
    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0 ; i <= arr.length ; i++){
        if(map.containsKey(target - arr[i])){
            result[0] = i;
            result[1] = map.get(target - arr[i]);
            return result;
        }
        map.put(arr[i],i);
    }
    return result;
}

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int targetedSum = 9;
        int[] result = findSum(arr,targetedSum);
        System.out.println(result);
        for(int r : result){
            System.out.print(r);
        }
        int[] hashingResult = findSumUsingHashing(arr,targetedSum);
        System.out.println("\n");
        for(int r : hashingResult){
            System.out.print(r+" ");
        }
    }
}
