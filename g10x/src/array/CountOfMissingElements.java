package array;

public class CountOfMissingElements {
	public static void main(String[] args) {
		int[] arr = {5,10,15};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length; i++)
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
		
		int count = 0;
		
		for(int i = min; i<=max; i++)
		{
			boolean flag = true;
			for(int j = 0; j<arr.length; j++)
			{
				if(i == arr[j])
				{
					flag = false;
					break;
				}
			}
			
			if(flag)
			{
				count++;
			}
		}
		
		System.out.println("Total no of missing elements is: " + count);
	}
}
