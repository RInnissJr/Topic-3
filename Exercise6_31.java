import java.util.Scanner;
public class Exercise6_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		  long number;
		 
		  do 
		  {
		   System.out.print("Enter a credit card number as a long integer (enter 0 to stop program):");
		 
		   number = input.nextLong();
		 
		   if (number != 0) {
		    if (isValid(number)) {
		     System.out.println(number + " is valid.");
		    } else {
		     System.out.println(number + " is invalid.");
		    }
		   }
		 
		  } while (number != 0);
		 
		 }
		 
		 public static boolean isValid(long number) 
		 {
		  int firstPrefix = (int) getPrefix(number, 1);
		  if (firstPrefix != 4 && firstPrefix != 5 && firstPrefix != 3 && firstPrefix != 6)
		  {
		   return false;
		  }

		  if (firstPrefix == 3)
		  {
		   int secondPrefix = (int) getPrefix(number, 2);
		   if (secondPrefix != 37) 
		   {
		    return false;
		   }
		  }
		 

		 
		  if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 != 0)
		  {
		   return false;
		  }
		 
		  return true;
		 
		 }
		 
		 public static int sumOfDoubleEvenPlace(long number) 
		 {
		  int n = getSize(number);
		  int sum = 0;
		 
		  for (int i = 2; i <= n; i += 2) 
		  {
		   sum += getDigit(2 * getDigitFromIndex(number, i));
		  }
		 
		  return sum;
		 
		 }
		  
		 public static int getDigitFromIndex(long number, int index)
		 {
		  int digit;
		  digit = (int) (((number / Math.pow(10, index - 1))) % 10);
		  return digit;
		 }
		 
		 public static int getDigit(int number) 
		 {
		 
		  int firstDigit = number / 10;
		  int secondDigit = number % 10;
		 
		  if (firstDigit == 0) 
		  {
		   return number;
		  } else
		  {
		   return firstDigit + secondDigit;
		  }
		 
		 }
		 
		 public static int sumOfOddPlace(long number) 
		 {
		  int n = getSize(number);
		  int sum = 0;
		 
		  for (int i = 1; i <= n; i += 2)
		  {
		   sum += getDigitFromIndex(number, i);
		  }
		 
		  return sum;
		 
		 }
		 
		 public static boolean prefixMatched(long number, int d)
		 {
		 
		  if (getPrefix(number, getSize(d)) == d) 
		  {
		   return true;
		  }
		  return false;
		 
		 }
		 
		 public static int getSize(long d)
		 {
		 
		  int numberOfDigit = 1;
		  while ((d = d / 10) != 0)
		  {
		   numberOfDigit++;
		  }
		  return numberOfDigit;
		 
		 }
		 
		 public static long getPrefix(long number, int k)
		 {
		 
		  int numberOfDigit = getSize(number);
		  return number / (long) (Math.pow(10.0, (double) (numberOfDigit - k)));
		 
		 }
}
