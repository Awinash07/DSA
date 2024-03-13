package BinarySearch;

public class CountRotations {
    //This method is to count no of rotations in a sorted array.
    public int countRotations(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(end >= start){
            int mid = start + (end - start)/2;
            int prev = arr[mid - 1];
            int next = arr[mid + 1];
            if(arr[start] <= arr[end]){
                return start;
            }

            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev])
            {
                // Mid element is the smallest, indicating the pivot point.
                return mid;
            }
            else if(arr[mid] <= arr[end])
            {
                // Right half is sorted, search in left half.
                end = mid - 1;
            }
            else if(arr[mid] >= arr[start])
            {
                // Left half is sorted, search in right half.
                start = mid + 1;
            }
        }
        return -1;
    }
}
