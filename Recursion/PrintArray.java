package Recursion;

public class PrintArray {

    public static void printArray(int[] array, int idx){
        if(idx == -1){
            return;
        }
        printArray(array,idx-1);
        System.out.print(array[idx]);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        printArray(array,4);

    }
}
