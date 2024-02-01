package Heap;

import java.util.Arrays;

public class MinHeap {
    static void min_heapify(int[] arr, int i,  int n)
    {
        int left = 2*i;
        int right = 2*i+1;
        int smallest;
        if(left <= n && arr[left] < arr[i])
            smallest = left;
        else
            smallest = i;
        if(right <= n && arr[right] < arr[i])
            smallest = right;

        if(smallest != i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = arr[i];
            min_heapify(arr, smallest , n);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,2,45,5,6,7};
        int n = arr.length - 1;
        min_heapify(arr,0,n);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
