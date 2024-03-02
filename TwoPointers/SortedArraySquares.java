package TwoPointers;

public class SortedArraySquares {
    public int[] sortedArraySquares(int[] arr){
        int right = arr.length - 1, left = 0;
        int[] squares = new int[arr.length];
        int highestSquareIdx = arr.length - 1;
        while(left <= right){
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if(leftSquare > rightSquare){
                squares[highestSquareIdx--] = leftSquare;
                left++;
            }else{
                squares[highestSquareIdx--] = rightSquare;
                right--;
            }
        }
        return squares;
    }
}
