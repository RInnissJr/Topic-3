import java.util.Scanner; 
public class Exercise18_10
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		
	    String str = input.next();
		char ch = input.next().charAt(0);
		
	     System.out.println(count(str, ch));
	
	 }
	
	 public static int count(String s, char ch)
	 {
		       int n =  (ch == s.charAt(0)) ? 1 : 0;
		       
		       if (s.length() == 1)
		           return n;
		       else
		           return n + count(s.substring(1), ch);
	    }
}
