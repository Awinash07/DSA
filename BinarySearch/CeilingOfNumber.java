package BinarySearch;

public class CeilingOfNumber {
    public int ceilingOfNumber(int[] arr, int key)
    {
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(key < arr[mid])
                end = mid - 1;
            else if(key > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return start;
    }
}
