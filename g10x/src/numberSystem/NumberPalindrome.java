package numberSystem;

public class NumberPalindrome {
	static void operation(int n)
	{
		int rev = 0;
		int temp = n;
		
		while(n != 0)
		{
			int rem = n%10;
			rev = rev*10 + rem;
			n/=10;
		}
		
//		System.out.println(rev);
		
		if(rev == temp)
		{
			System.out.println(temp + " is a Palindrome Number");
		}
		else
		{
			System.out.println(temp + " is not a Palindrome Number");
		}
	}
	
	public static void main(String[] args) {
		int number = 1221;
		
		operation(number);
	}
}
