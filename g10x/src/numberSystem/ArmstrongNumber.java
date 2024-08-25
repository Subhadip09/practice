package numberSystem;

public class ArmstrongNumber {
	static int noOfDigits(int n)
	{
		int count = 0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		
		return count;
	}
	
	static void operation(int n)
	{
		int digit_count = noOfDigits(n);
		int sum = 0;
		int temp = n;
		
		while(n!=0)
		{
			int rem = n%10;
//			sum = sum + (int) Math.pow(rem, digit_count);
			
			int power =  1;
			for(int i = 1; i<=digit_count; i++)
			{
				power = power*rem;
			}
			sum = sum + power;
//			System.out.println(power);
			n/=10;
		}
		System.out.println(sum);
		
		if(sum == temp)
		{
			System.out.println(temp + " is a Armstrong Number");
		}
		else
		{
			System.out.println(temp + " is not a Armstrong Number");
		}
	}
	
	public static void main(String[] args) {
		int n = 153;
		
		operation(n);
	}
}
