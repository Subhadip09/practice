package string;

import java.util.Arrays;

//I/P: "water__is__crystal__and__clear" // (two spaces)
//O/P: "water_is_crystal_and_clear" // (single space)
public class RemoveExtraSpacesFromString {
	public static void main(String[] args) {
		
	/*	using function
		String s = "water    is   crystal  and  clear";	
		String s1 = s.replaceAll("\\s+", " ");
		
		System.out.println(s1);
	*/
		
		String s = "water    is   crystal  and  clear";
		
		String output = "";
		char prev_char = ' ';
		
		for(int i = 0; i<s.length(); i++)
		{
			char current_char = s.charAt(i); // a
			
			if(current_char != ' ' || prev_char != ' ')
			{
				output = output + current_char;
			}
			
			prev_char = current_char; // w
		}
		
		System.out.println(output);
		
	}
}
