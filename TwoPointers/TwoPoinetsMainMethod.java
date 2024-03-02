package TwoPointers;

public class TwoPoinetsMainMethod {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int[] arrWithDuplicates = {1,1,2,2,3,3};
        // Two sum Doc-problem 1
        TwoSum twoSum = new TwoSum();
        int[] resultTwoSum = twoSum.targetedSum(arr,6);
        System.out.print("index of two no giving targeted sum : ");
        for(int i = 0; i < resultTwoSum.length; i++) System.out.print(resultTwoSum[i]+" ");

        // Two sum using Hash Map  Doc-problem 2
        TwoSumHashTable twoSumHashTable = new TwoSumHashTable();
        int[] resultTwoSumHashTable = twoSumHashTable.twoSumUsingHashTable(arr,6);
        System.out.println();
        System.out.print("index of two no giving targated sum by using Hash Table: ");
        for(int i = 0; i < resultTwoSumHashTable.length; i++) System.out.print(resultTwoSumHashTable[i]+" ");

        // Remove Duplicates Doc-problem 3
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicates(arrWithDuplicates);
        System.out.println();
        System.out.println("length of array having non duplicate elements : "+length);
    }
}
