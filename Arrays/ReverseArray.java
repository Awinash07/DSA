package Arrays;

// Iterative java program to reverse an
// array
public class ReverseArray {

    /* Function to reverse arr[] from start to end*/
    public static void reverseArray(int arr[], int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    /* Utility that prints out an array on a line */
    public static void printArray(int arr[] , int size){
        for(int i = 0; i < size ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


   public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    printArray(arr, arr.length);
    reverseArray(arr, 0, arr.length-1);
    printArray(arr, arr.length);
    
   }
    
}
