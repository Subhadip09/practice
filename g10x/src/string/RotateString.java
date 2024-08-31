package string;

public class RotateString {
	
	public static void main(String[] args) {
		String str = "java";
		
		char[] string = str.toCharArray();
		
		int times = 2;
		
		for(int i = 1; i<=times; i++)
		{
			char temp = string[0];
			for(int j = 1; j<string.length; j++)
			{
				string[j-1] = string[j];
			}
			string[string.length-1] = temp;
		}
		
		String st = new String(string);
		
		System.out.println(st);
	}

}
