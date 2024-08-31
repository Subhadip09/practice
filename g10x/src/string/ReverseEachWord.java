package string;

public class ReverseEachWord {
	static void reverse(String s)
	{
		String rev = "";
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.print(rev + " ");
	}
	
	public static void main(String[] args) {
		String str = "  Thon is python   ";
		
		str = str.trim();
		
		String[] st = str.split(" ");
		
		for(int i = 0; i<st.length; i++)
		{
			reverse(st[i]);
		}
		
		
	}

}
