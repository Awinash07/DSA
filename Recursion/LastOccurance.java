package Recursion;

public class LastOccurance {
    public static int lastOccurance(int[] arr, int no, int idx){
        if(idx == arr.length){
            return -1;
        }
        int lastIdx = lastOccurance(arr, no, idx + 1);
        if(lastIdx == -1){
            if(arr[idx] == no){
                return idx;
            }else{
                return -1;
            }
        }else{
            return lastIdx;
        }
        
    }
    public static void main(String[] args) {
        int arr[]  = {1,9,2,4,2};
        int lastOccuranceIdx = lastOccurance(arr, 2,0);
        System.out.println(lastOccuranceIdx);  
    }
    
}
