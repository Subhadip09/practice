package string;

public class PrintString {
	public static void main(String[] args) {
		String str = "ABCD";
		
		for(int i = 0; i<str.length(); i++)
		{
			System.out.print(str.charAt(i) + " ");
		}
	}
}
