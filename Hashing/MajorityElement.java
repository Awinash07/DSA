package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static void findMajorityElement(int[] arr){
		Map<Integer, Integer> map = new HashMap<>();
		for (int j : arr) {
			int count = 1;
			if (!map.containsKey(j)) {
				map.put(j, count);
			} else {
				int num = map.get(j);
				map.put(j, num + 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			int maxLen = arr.length;
			int fun = maxLen/3;
			if(entry.getValue()>fun) System.out.println(entry.getKey());
		}
	}

	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,5,5};
		findMajorityElement(arr);
	}
}