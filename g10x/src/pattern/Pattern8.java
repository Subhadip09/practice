package pattern;

/*
 *     *
 *    **
 *   ***
 *  ****
 * *****
 *  ****
 *   ***
 *    **
 *     *
 */
public class Pattern8 {
	static void sub(int n)
	{
		for(int row = 1; row<=(2*n)-1; row++)
		{
			for(int col = 1; col<=n; col++)
			{
				if((row + col)>=(n+1) && (row-col)<=(n-1))
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
		
//		for(int row = 1; row<n; row++)
//		{
//			for(int col = 1; col<n; col++)
//			{
//				if(col>=row)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
	}
	
	public static void main(String[] args) {
		int n = 5;
		sub(n);
	}

}
