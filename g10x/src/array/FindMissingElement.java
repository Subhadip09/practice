package array;

public class FindMissingElement {
	public static void main(String[] args) {
		int[] arr = {4,2,3,1,10};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Min value is: " + min);
		System.out.println("Max value is: " + max);
		
		System.out.println("Missing elements are: ");
		for(int i = min; i<=max; i++)
		{
			boolean flag = false;
			for(int j = 0; j<arr.length; j++)
			{
				if(arr[j] == i)
				{
					flag = true;
					break;
				}
			}
			
			if(!flag)
			{
				System.out.print(i + " ");
			}
		}
	}
}
