package string;

public class StringPlaindrome {
	public static void main(String[] args) {
		String str = "madam";
		System.out.println("Original string is: " + str);
		
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Reverse string is: " + rev);
		
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}
