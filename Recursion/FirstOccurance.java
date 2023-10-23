package Recursion;

public class FirstOccurance {

    public static int firstOccurance(int[] arr, int no, int idx){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == no){
            return idx;
        }else{
            int fidx = firstOccurance(arr, no, idx + 1);
            return fidx;
        }
    }

    public static void main(String[] args) {
        int arr[]  = {1,9,2,4,2};
        int firstOccuranceNo = firstOccurance(arr, 2,0);
        System.out.println(firstOccuranceNo);       
    }
    
}
