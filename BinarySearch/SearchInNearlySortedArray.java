package BinarySearch;

public class SearchInNearlySortedArray {

    public int serachInNearlySortedArray(int[] arr, int target)
    {
        int start = 0, end = arr.length - 1;
        while(end >= start){
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
                return mid;

            if(mid < arr.length - 1  && arr[mid + 1] == target)
                return mid + 1;

            if(mid > 0 && arr[mid - 1] == target)
                return mid - 1;

            if(target < arr[mid])
            {
                end = mid - 2;
            }
            else
            {
                start = mid + 2;
            }
        }
        return -1;
    }
}
