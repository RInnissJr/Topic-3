import java.util.Scanner; 
public class Exercise18_2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 System.out.print("Enter a fibonacci index: ");
		 
	      int index = input.nextInt();
	      
	      System.out.println("The fibonacci value is " + fibonacci(index));

	}

	public static long fibonacci(int index)
    {

	        if (index == 0)
	            return 0;
	        if (index == 1)
	            return 1;

	        int f0 = 0;
	        int f1 = 1;
	        int fib;
	        for (int i = 2; i <= index; i++)
	        {
	            fib = f0 + f1;
	            f0 = f1;
	            f1 = fib;
	        }
	        return f1;
	}

}
