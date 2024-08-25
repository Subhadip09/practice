package pattern;

import java.util.Scanner;

/*
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */
public class Pattern4 {
	static void sub(int n)
	{
		for(int row = 1; row<=n; row++)
		{
			for(int col = 1; col<=(2*n)-1; col++)
			{
				if((col>=row) && ((row+col) <= 2*n))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
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
