package string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfString {
	public static void main(String[] args) {
		String str = "Developer";
		
		str = str.toLowerCase();
		
		char[] string = str.toCharArray(); 
		
//		char[] freq = new char[string.length];
//		char visited = '0';
		
		for(int i = 0; i<string.length; i++)
		{
			int count = 1;
			for(int j = i+1; j<string.length; j++)
			{
				if(string[i] == string[j] && string[j] != ' ')
				{
					count++;
					string[j] = '0';
				}
			}
			
			if(string[i] != ' ' && string[i] != '0')
			{
				System.out.println(string[i] + " ocuurs " + count + " times");
			}
		}
		System.out.println();
		//using hashmap
		
		String str1 = "Java is Emotion";
		
		str1 = str1.toLowerCase();
		
		char[] string1 = str1.toCharArray();
		
		Map<Character, Integer> mp = new HashMap<>(); 
		
		for(char c : string1)
		{
//			if(mp.containsKey(c))
//			{
//				mp.put(c, mp.get(c) + 1);
//			}
//			else
//			{
//				mp.put(c,1);
//			}
			
			if(c == ' ')
			{
				continue;
			}
			
			mp.put(c, mp.getOrDefault(c, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry : mp.entrySet())
		{
			System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times ");
		}
	}
}
