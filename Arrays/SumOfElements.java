package Arrays;

public class SumOfElements {
	public static void main(String[] args) {
		int[] arr = {12,2,3};
		
		int sum = 0;
		
		for(int num: arr) {
			sum += num;
		}
		
		System.out.println("Sum of all elements in array: "+sum);
	}

}
