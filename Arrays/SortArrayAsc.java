package Arrays;

import java.util.Arrays;

public class SortArrayAsc {
	public static void main(String[] args) {
		int[] arr = {12,3,23,8,11};
		int n = arr.length;
		
		// Using bubble sort
		for(int i=0; i< n-1; i++) {
			for(int j =0 ; j<n-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array sorted in ascending order: "+Arrays.toString(arr));
	}
}
