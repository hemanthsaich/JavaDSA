package Arrays;

import java.util.HashSet;
import java.util.Set;

//Program to find duplicate in array
//Input: {1,2,5,3,2,5}
//output: 

public class DuplicateElement {
	public static void main(String[] args) {
		int[] arr = {1,2,5,3,2,5};
		
		Set<Integer> uniqueElements = new HashSet<>(); 
		
		for(int i=0 ; i < arr.length;i++) {
			if(uniqueElements.contains(arr[i])) {
				System.out.println("Duplicate element: "+arr[i]);
				
			}else {
				uniqueElements.add(arr[i]);
			}
		}
		
		System.out.println("Unique arr:"+ uniqueElements);
	}
}
