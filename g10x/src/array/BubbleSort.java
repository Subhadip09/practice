package array;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {10,4,6,2,1};
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array is: " + Arrays.toString(arr));
	}

}
