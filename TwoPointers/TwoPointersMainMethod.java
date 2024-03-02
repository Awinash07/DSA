package TwoPointers;

public class TwoPointersMainMethod {

    public static void main(String[] args) {
        // Inputs
        int[] arr = {1, 2, 3, 4, 6};
        int[] arrWithDuplicates = {1,1,2,2,5,5,4,4,3,3};
        int[] negativeArray = {-1,-2,3,2};

        // Two sum Doc-problem 1
        TwoSum twoSum = new TwoSum();
        int[] resultTwoSum = twoSum.targetedSum(arr,6);
        System.out.print(" Q-1 index of two no giving targeted sum : ");
        for(int i = 0; i < resultTwoSum.length; i++) System.out.print(resultTwoSum[i]+" ");

        // Two sum using Hash Map  Doc-problem 2
        TwoSumHashTable twoSumHashTable = new TwoSumHashTable();
        int[] resultTwoSumHashTable = twoSumHashTable.twoSumUsingHashTable(arr,6);
        System.out.print("\n Q-2 index of two no giving targated sum by using Hash Table: ");
        for(int i = 0; i < resultTwoSumHashTable.length; i++) System.out.print(resultTwoSumHashTable[i]+" ");

        // Remove Duplicates Doc-problem 3
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println("\n Q-3 length of array having non duplicate elements : "
                +removeDuplicates.removeDuplicates(arrWithDuplicates));

        // Removing Key Elements from an array Doc_problem 4
        RemoveKeyElement removeKeyElement =  new RemoveKeyElement();
        System.out.println(" Q-4 length of array having no key elements :"
                + removeKeyElement.removeKeyElement(arrWithDuplicates, 2));

        //Squaring a sorted array Doc_problem 5
        SortedArraySquares sortedArraySquares = new SortedArraySquares();
        int[]  sortedArraySquaresResult = sortedArraySquares.sortedArraySquares(negativeArray);
        System.out.print(" Q-5 squaring a sorted array : review ");
        for(int i = 0; i < sortedArraySquaresResult.length; i++) System.out.print(" "+sortedArraySquaresResult[i]+" ");

    }
}
