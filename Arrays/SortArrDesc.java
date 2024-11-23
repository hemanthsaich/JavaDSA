package Arrays;

import java.util.Arrays;

public class SortArrDesc {
	public static void main(String[] args) {
		
		int[] arr = {12,1,22,34,10};
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j< n-1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Array sorted in descending order: "+Arrays.toString(arr));
	}

}
