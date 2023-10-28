package Recursion;

public class MaxOfArray {
    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
       int max = maxOfArray(arr,idx+1);
        if(arr[idx] > max){
            return arr[idx];
        }else {
            return max;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,5,6,2,8};
        int max = maxOfArray(arr,0);
        System.out.println(max);
    }
}
