package array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		// for loop
		/*
		for(int i = 0; i<arr.length/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		*/
		
		// using while loop
		int start = 0;
		int end = arr.length -1;
		while(start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
