package pattern;

import java.util.Scanner;

/*
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Pattern1 {
	static void sub(int n)
	{
		for(int row = 1; row<=n; row++)
		{
			for(int col = 1; col<=n; col++)
			{
				if(row>=col)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		sub(n);
	}
}
