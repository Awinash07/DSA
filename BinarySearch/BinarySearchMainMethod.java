package BinarySearch;

public class BinarySearchMainMethod {
    public static void main(String[] args) {

        //seach element in binary(Order Agnostic). Doc-1
        Search search = new Search();
        System.out.println("Binary Search ascending & decending Array : "
                +search.search(new int[] { 4, 6, 10 }, 10));

        //Find first & last occurrence of an element.
        FirstAndLastOccurrences firstAndLastOccurrences = new FirstAndLastOccurrences();
        System.out.println("firstOccurrence & LastOccurrence: "
                +firstAndLastOccurrences.firstAndLastOccurrences(new int[] {3,3,4,5,6,6,6,6,10}, 6));

        //No of times a sorted array is rotated.
        CountRotations countRotations = new CountRotations();
        System.out.println("No of times sorted array is rotated : "
                +countRotations.countRotations(new int[] {11,12,15,18,2,5,6,8}));

        //search in rotated array
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        System.out.println("Search an element in rotated array : "
                +searchInRotatedArray.searchInRotatedArray(new int[] {11,12,15,18,2,5,6,8},2));

        //search in nearly sorted array
        SearchInNearlySortedArray searchInNearlySortedArray = new SearchInNearlySortedArray();
        System.out.println("serach in nearly sorted array : "
                +searchInNearlySortedArray.serachInNearlySortedArray(new int[]{15, 20, 30, 25, 35},25));

        //Find floor of a number. Doc-3
        FloorOfNumber floorOfNumber = new FloorOfNumber();
        System.out.println("Find floor of a number : "
                +floorOfNumber.floorOfNumber(new int[] {1, 3, 8, 10, 15},12));

        //Find ceiling of a number. Doc - 2
        CeilingOfNumber ceilingOfNumber = new CeilingOfNumber();
        System.out.println("Find ceiling of a number : "
                +ceilingOfNumber.ceilingOfNumber(new int[] {1, 3, 8, 10, 15},12));
    }
}
