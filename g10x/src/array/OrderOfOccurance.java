package array;

import java.util.HashMap;
import java.util.Map;

public class OrderOfOccurance {
	public static void main(String[] args) {
		// using for loop
		
		int[] arr = {10,20,15,20,15,10,25,15};
		
		int[] freq = new int[arr.length];
		int visited = -1;
		
		for(int i= 0; i<arr.length; i++)
		{
			int count = 1;
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					freq[j] = visited;
				}
			}
			
			if(freq[i] != visited)
			{
				System.out.println(arr[i] + " occurs " + count + " times");
			}
		}
		System.out.println();
		// using HashMap
		
		int[] arr1 = {11,12,13,11,14,12,11};
		
		Map<Integer, Integer> mp = new HashMap<> ();
		
		for(int element : arr1)
		{
			if(mp.containsKey(element))
			{
				mp.put(element, mp.get(element)+1);
			}
			else
			{
				mp.put(element, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> m : mp.entrySet())
		{
			System.out.println(m.getKey() + " occurs " + m.getValue() + " times");
		}
	}
}
