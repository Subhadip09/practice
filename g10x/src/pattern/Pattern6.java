package pattern;

/*
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */

import java.util.Scanner;

public class Pattern6 {
	static void sub(int n)
	{
		for(int row = 1; row<=(2*n)-1; row++)
		{
			for(int col = 1; col<=(2*n)-1; col++)
			{
				if((row<=n) && (col>=row) && ((row+col)<=2*n))
				{
					System.out.print("*");
				}
				else if((row>n) && ((row+col)>=2*n) && (row>=col))
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
