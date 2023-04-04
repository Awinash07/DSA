//Maximum and Minimum Element in an Array
package Arrays;

public class MaxAndMinArray {
/* Class Pair is used to return two values from getMinMax() */
    public static class MinMaxPair{
        int min;
        int max;
    }

    public static MinMaxPair getMinMax(int arr[], int n){
        MinMaxPair pair = new MinMaxPair();

        /*If there is only one element then return it as min and max both*/
        if(n == 1){
            pair.max = arr[0];
            pair.min = arr[1];
        }

        /* If there are more than one elements, then initialize min and max*/
        if(arr[0] > arr[1]){
            pair.max = arr[0];
            pair.min = arr[1];
        }else{
            pair.max = arr[1];
            pair.min = arr[0];
        }
        for(int i = 2 ; i < arr.length; i++){
            if(arr[i] > pair.max){
                pair.max = arr[i];
            }
            if(arr[i] < pair.min){
                pair.min = arr[i];
            }
        }
        return pair;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,6};
        MinMaxPair minMaxPair = getMinMax(arr,arr.length);
        System.out.println(minMaxPair.min+","+minMaxPair.max);
    }
    
}
