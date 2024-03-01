package TwoPointers;

public class TwoPoinetsMainMethod {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        // Two sum
        TwoSum twoSum = new TwoSum();
        int[] resultTwoSum = twoSum.targetedSum(arr,6);
        System.out.print("index of two no giving targeted sum : ");
        for(int i = 0; i < resultTwoSum.length; i++) System.out.print(resultTwoSum[i]+" ");

        // Two sum using Hash Map
        TwoSumHashTable twoSumHashTable = new TwoSumHashTable();
        int[] resultTwoSumHashTable = twoSumHashTable.twoSumUsingHashTable(arr,6);
        System.out.println("index of two no giving targated sum by using Hash Table: ");
        for(int i = 0; i < resultTwoSumHashTable.length; i++) System.out.print(resultTwoSumHashTable[i]+" ");
    }
}
