package Arrays;


//Second Smallest Element in an array in Java
public class SecondSmallest {
	public static void main(String[] args) {
		int[] arr = {12,21,2,1,22};
		
		int secondSmallest = findSecondSmallest(arr);
		System.out.println("Second smallest element: "+secondSmallest);
	}
	
	public static int findSecondSmallest(int[] arr) {
		if(arr.length < 2) {
			throw new IllegalArgumentException("Array must have atleast two elements");
		}
		
		int secondSmallest = Integer.MAX_VALUE, smallest = Integer.MAX_VALUE;
		
		for(int num : arr) {
			if(num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			}else if(num > smallest && num < secondSmallest) {
				secondSmallest = num;
			}
		}
		
		return secondSmallest;
	}
}
