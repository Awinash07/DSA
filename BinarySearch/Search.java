package BinarySearch;

public class Search {
    public int search(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(key == arr[mid])
            {
                return mid;
            }
            if(isAscending)
            {
                if(key > arr[mid])
                {
                   start = mid+1;
                }else{
                    end = end-1;
                }
            } else {
                if(key > arr[mid])
                {
                     end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
