package Arrays;

public class SmallestElement {
	public static void main(String[] args) {
		int[] arr = {32,31,12,44,33};
		
		int min = arr[0];
		for(int i=0; i< arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Minimum element in array: "+min);
	}
}
