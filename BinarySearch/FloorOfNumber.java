package BinarySearch;

public class FloorOfNumber {

    public int floorOfNumber(int[] arr, int key)
    {
        if(key < arr[0])
            return -1;

        int start = 0, end = arr.length - 1, res = 0;
        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(key == arr[mid]) return mid;

            if(key < arr[mid])
                end = mid - 1;
            else if(key > arr[mid])
            {
                res = mid;
                start =  mid + 1;
            }
        }
        return res;
    }

}
