package BinarySearch;

public class FirstAndLastOccurrences {

    public int firstAndLastOccurrences(int[] arr, int no){
        int start = 0, end = arr.length - 1 , firstOccurrence = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(no == arr[mid]){
                firstOccurrence = mid;// for lastOccurrence start = mid + 1
                end = mid - 1;
            }
            if(no > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return firstOccurrence;
    }

}
