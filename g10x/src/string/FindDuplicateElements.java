package string;

public class FindDuplicateElements {
	public static void main(String[] args) {
		String str = "Java Developer";
		
		str = str.toLowerCase();
		
		char[] string = str.toCharArray();
		
		System.out.println("Duplicate elements are: ");
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
			
			if(count > 1 && string[i] != '0')
			{
				System.out.println(str.charAt(i));
			}
		}
	}
}
