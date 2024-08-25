package numberSystem;

public class SumofDigits {
	static void operation(int n)
	{
		int sum = 0;
		int temp = n;
		
		while(n!=0)
		{
			int rem = n%10;
			sum = sum + rem;
			n/=10;
		}
		
		System.out.println("Sum of " + temp + " is: " + sum);
	}
	
	public static void main(String[] args) 
	{
		int number = 145;
		
		operation(number);
	}
}
