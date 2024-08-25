package numberSystem;

// Strong Number means summation of factorial of each digits of a number
/*
 * n = 145
 * res = 1! + 4! + 5! = 1+24+120 = 145
 * if(res == n), then the number is a strong number
 */
public class StrongNumber {
	static void operation(int n)
	{
		int sum = 0;
		int temp = n;
		
		while(n!=0)
		{
			int rem = n%10;
			int fact = 1;
			
			for(int i = rem; i>=1; i--)
			{
				fact = fact*i;
			}
			
			sum = sum + fact;
			n/=10;
		}
		
		if(sum == temp)
		{
			System.out.println(temp + " is a strong number");
		}
		else
		{
			System.out.println(temp + " is not a strong number");
		}
	}
	
	public static void main(String[] args) {
		int n = 145;
		
		operation(n);
	}
}
