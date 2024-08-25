package numberSystem;

import java.util.Scanner;

public class Fibonacci {
	static void operation(int n)
	{
		int a = 0;
		int b = 1;
		
		System.out.println("Fibonacci Series upto " + n + " is ");
		for(int i = 1; i<=n; i++)
		{
			System.out.print(a + " ");
			int c = a+b;
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the position upto which you want to print: ");
		
		int n = sc.nextInt();
		
		operation(n);
	}
}
