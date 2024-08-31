package array;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicatesInArray {
	// using for loop
	
	/*
	public static void main(String[] args) {
		int[] arr = {10,15,10,10,20,13,15};
		
		int[] freq = new int[arr.length];
		int visited = -1;
		
		System.out.println("Duplicate elements are: ");
		for(int i = 0; i<arr.length; i++)
		{
			int count = 1;
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					freq[j] = visited;
					count++;
				}
			}
			
			if(freq[i] != visited)
			{
				if(count > 1)
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
	*/
	
	// using hasmap
	public static void main(String[] args) {
		int[] arr = {10,15,10,10,20,13,15};
		
		HashMap<Integer, Integer> hs = new HashMap<>();
		
		for(int element : arr)
		{
			if(hs.containsKey(element))
			{
				hs.put(element, hs.get(element)+1);
			}
			else
			{
				hs.put(element, 1);
			}
		}
		
		for(HashMap.Entry<Integer, Integer> m : hs.entrySet())
		{
			if(m.getValue() > 1)
			{
				System.out.println(m.getKey());
			}
//			System.out.println("Element: " + m.getKey() + " occurs: " + m.getValue() + " times");
		}
		
	}
}
