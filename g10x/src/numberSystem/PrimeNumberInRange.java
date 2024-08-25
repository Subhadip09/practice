package numberSystem;

public class PrimeNumberInRange {
	static void operation(int l, int u)
	{
		for(int i = l; i <= u; i++)
		{
			if(i > 1)
			{
				int count = 0;
				for(int j = 2; j<i; j++)
				{
					if(i%j == 0)
					{
						count++;
					}
				}
				
				if(count == 0)
				{
					System.out.print(i + " ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int lower_limit = 2;
		int higher_limit = 20;
		
		operation(lower_limit, higher_limit);
	}
}
