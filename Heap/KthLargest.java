package Heap;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.BiFunction;

public class KthLargest {
    public static void kthLargest(int[] values, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0 ; i < values.length ; i++){
            minHeap.add(values[i]);
            if(minHeap.size() > k+1){
                minHeap.poll();
            }
        }
        while(minHeap.size() > 0){
            System.out.println(minHeap.peek());
            minHeap.poll();
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,20,15,22};
        kthLargest(arr, 3);
    }    
}
