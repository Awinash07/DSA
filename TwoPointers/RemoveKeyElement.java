package TwoPointers;

public class RemoveKeyElement {
    public int removeKeyElement(int[] arr, int key){
        int nextElement = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[nextElement] = arr[key];
                nextElement++;
            }
        }
        return nextElement;
    }
}
