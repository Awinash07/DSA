package Heap;

import java.util.Arrays;

public class MaxHeapify {
    static  void maxHeapyfy(int arr[], int i, int n){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if (left <= n && arr[left] > arr[i]) largest = left;
        if (right <= n && arr[right] > arr[i]) largest = right;
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapyfy(arr, largest , n);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,2,45,5,6,7};
        int n = arr.length - 1;
        maxHeapyfy(arr,0,n);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
