package Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionAndIntersection {
    public static int union(int[] arr1, int[] arr2){
        HashSet set = new HashSet<>();
        for(int i = 0 ; i < arr1.length ; i++){
            set.add(arr1[i]);
        }
        for(int j = 0 ;j < arr2.length ; j++){
            set.add(arr2[j]);
        }
        System.out.println(set);
        return set.size();
    }
    public static int intersection(int[] arr1, int[] arr2){
        Set set = new HashSet<>();
        List list = new ArrayList<>();
        for(int i = 0;i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j=0 ; j < arr2.length ; j++){
            if(set.contains(arr2[j])){
                list.add(arr2[j]);
            }
        }
        System.out.println(list);
        return list.size();
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,6,7,8};
        int usize = union(arr1,arr2);
        int isize = intersection(arr1,arr2);
        
    }
    
}
