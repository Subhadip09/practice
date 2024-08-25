package numberSystem;

public class PrimeNumber {
	void operation(int n)
	{
		int count = 0;
		
		for(int i = 2; i<n; i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}
		
		if(count == 0)
		{
			System.out.println("Prime No");
		}
		else
		{
			System.out.println("Not a prime No");
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber obj = new PrimeNumber();
		
		int number = 2;
		
		obj.operation(number);
	}
}
