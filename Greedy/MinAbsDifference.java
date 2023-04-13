/**
 *  Min absolute difference pair :-
 *  Given two arrays a & b of equal length n. pair each element of array a to an element in array b ,
 *  such that sum s of absolute difference os all the pairs is minimum.
 *
 *  A = [1,2,3]
 *  B = [2,1,3]
 *  ans = 0
 *
 *  a = {4,1,8,7};
 *  b = {2,3,5,6};
 *  ans = 6
 */


package Greedy;

import java.util.Arrays;

public class MinAbsDifference {

    public int minDiff(int a[] ,int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int mindiff = 0;
        for(int i = 0; i < a.length ;i++){
            mindiff = mindiff + Math.abs(a[i] - b[i]);
        }
        return mindiff;
    }

    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] b = {2,1,3};
        MinAbsDifference minAbsDifferencen = new MinAbsDifference();
        int result = minAbsDifferencen.minDiff(a,b);
        System.out.println(result);
    }
}
