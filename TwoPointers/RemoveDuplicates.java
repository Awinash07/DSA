package TwoPointers;

public class RemoveDuplicates {
    public int removeDuplicates(int[] arr){
        int nextNonDuplicate = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[nextNonDuplicate - 1] != arr[i]){
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;
    }
}
