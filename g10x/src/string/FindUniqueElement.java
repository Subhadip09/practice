package string;

public class FindUniqueElement {
	
	public static void main(String[] args) {
		String str = "developer";
		
		char[] string = str.toCharArray();
		
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
				if(count == 1)
				{
					System.out.println(string[i] + "-" + count);
				}
				
			}
		}
	}

}
