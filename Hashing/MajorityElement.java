package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static void findMajorityElement(int arr[]){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++){
			int count = 1;
			if(!map.containsKey(arr[i])){
				map.put(arr[i],count);
			}else{
				int num = map.get(arr[i]);
				map.put(arr[i],num+1);
			}	
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int maxLen = arr.length;
			int fun = maxLen/3;
			if(entry.getValue()>fun){
				System.out.println(entry.getKey());
			}
		}
	}

	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,5,5};
		findMajorityElement(arr);
	}
}