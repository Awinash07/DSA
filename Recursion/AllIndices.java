package Recursion;

public class AllIndices {

    public static int[] findAllIndices(int[] arr, int idx, int fsf, int no){
        if(idx == arr.length){
            return new int[fsf];
        }
        if(arr[idx] == no){
            int[] iarr = findAllIndices(arr, idx+1, fsf+1, no);
            iarr[fsf] = idx;
            return iarr;
        }else{
            int[] iarr = findAllIndices(arr, idx+1, fsf, no);
            return iarr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4};
        int[] arrInd = findAllIndices(arr, 0 , 0, 4);
        for(int i = 0 ; i < arrInd.length; i++){
            System.out.println(arrInd[i]);
        }
    }    
}
