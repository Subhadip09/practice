package array;

import java.util.Arrays;
import java.util.Scanner;

public class DeletingElementInAGivenPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {100,200,300,400};
		
		System.out.println("Enter the position you want to delete: ");
		int position = sc.nextInt();
				
		for(int i = position-1; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		System.out.println(Arrays.toString(arr));
	}
}
