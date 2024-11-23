package Arrays;

//Largest Element of the array using Java
//Here, in this page we will discuss the program to find the largest element of the array using java. 
//We are given with an array and we need to print the largest element among the given elements of the array.

public class LargestElement {
	public static void main(String[] args) {
		int[] arr = {1,5,3,2,3,29};
		int max = arr[0];
		for(int i=0; i< arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("Max element in array: "+max);
	}
}
