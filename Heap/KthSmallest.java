package Heap;

import java.util.PriorityQueue;

public class KthSmallest {
    public static int kthSmallestElement(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();

        for(int i = 0; i < arr.length; i++){
            maxHeap.add(arr[i]);
            if(maxHeap.size() > k + 1){
                maxHeap.poll();
            }
        }
        while(maxHeap.size() > 0){
            System.out.println(maxHeap.peek());
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,20,15};
        int no = kthSmallestElement(arr, 3);
        System.out.println(no);
    }
    
}
