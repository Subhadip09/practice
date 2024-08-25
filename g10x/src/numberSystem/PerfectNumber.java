package numberSystem;
// Perfect Number
/*
 *  sum of the divisor == number
 *  n = 28
 *  divisor will be 1, 2, 4, 7, 14
 *  if(sum of divisor == number), then that number is a perfect number 
 */
public class PerfectNumber {
	static void operation(int n)
	{
		int sum = 0;
		int temp = n;
		
		for(int i = 1; i<n; i++)
		{
			if(n%i == 0)
			{
				sum = sum + i;
			}
		}
		
		if(sum == temp)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a Perfect Number");
		}
	}
	
	public static void main(String[] args) {
		int number = 28;
		
		operation(number);
	}

}
