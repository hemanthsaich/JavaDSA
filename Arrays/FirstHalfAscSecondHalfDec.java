package Arrays;

import java.util.Arrays;

//Java Program for Sorting first half in Ascending order and second half in Descending order


public class FirstHalfAscSecondHalfDec {
	public static void main(String[] args) {
		int[] arr = {1,22,13,12,19};
		
		Arrays.sort(arr);
		int n = arr.length;
		
		for(int i=0; i < n/2 ; i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=n-1; i>= n/2; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
