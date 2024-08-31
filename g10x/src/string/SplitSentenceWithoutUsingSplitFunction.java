package string;

public class SplitSentenceWithoutUsingSplitFunction {
	public static void main(String[] args) {
		
		String str = "Java is platform independent";
		
		for(int i = 0; i<str.length(); i++) {
			String res = "";
			if((i == 0 && str.charAt(i) != ' ') || (str.charAt(i) != ' ' && str.charAt(i-1) == ' '))
			{
				while(i<str.length() && str.charAt(i) != ' ')
				{
					
				
				res = res + str.charAt(i);
				i++;
				}
			}
			System.out.println(res);
		}
	}
}
