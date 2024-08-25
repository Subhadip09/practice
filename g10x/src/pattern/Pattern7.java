package pattern;

/*
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 */
public class Pattern7 {
	static void sub(int n)
	{
		for(int row = 1; row<=(2*n)-1; row++)
		{
			for(int col = 1; col<=n; col++)
			{
				if(row>=col && (row+col)<=2*n)
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
		
//		for(int row = n-1; row>=1; row--)
//		{
//			for(int col = 1; col<=row; col++)
//			{
//				
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	
	public static void main(String[] args) {
		int n = 5;
		
		sub(n);
	}
}
