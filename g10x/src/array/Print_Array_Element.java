package array;

import java.util.Arrays;

public class Print_Array_Element {
	
	public static void main(String[] args) {
		int[] arr = {10,20,30};
		
		// 1st one using for loop
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 2nd one using Arrays.toString method
		System.out.println(Arrays.toString(arr));
	}
}
