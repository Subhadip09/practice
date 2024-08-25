package numberSystem;

public class SwapUsingThirdVariable {
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c;
		
		c = a; // c = 10
		a = b; // a = 20
		b = c; // b = 10
		
		System.out.println("value of a: " + a);
		System.out.println("value of b: " + b);
	}
}
