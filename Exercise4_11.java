import java.util.Scanner;
public class Exercise4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a decimal value (0 to 15): ");
		  Scanner input = new Scanner(System.in);
		  int i = input.nextInt();
		 
		  if (i < 0 || i > 15) {
		   System.out.println(i + " is an invalid input");
		   System.exit(0);
		  }
		 
		  System.out.println("The hex value is "
		    + Integer.toHexString(i).toUpperCase());
	}

}
