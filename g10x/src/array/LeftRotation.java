package array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
	static void rotation(int[] arr, int times)
	{
		for(int i = 1; i<=times; i++)
		{
			int temp = arr[0];
			for(int j = 1; j<arr.length; j++)
			{
				arr[j-1] = arr[j];
			}
			arr[arr.length-1] = temp;
		}
		
		System.out.println("After "+times+" times left rotation array is "+ Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {10,20,30,40};
		
		System.out.println("Enter the no of times you want to rotate the array: ");
		int times = sc.nextInt();
		
		rotation(arr, times);
	}
}
