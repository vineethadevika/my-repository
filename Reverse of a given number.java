package Numbers;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = obj.nextInt(); // 1234
		int rev= 0 , rem ;
		while(n != 0) // n= 1234, 123 , 12 , 1
		{
		// to identify last digit of a number
			rem = n%10; // rem = 1%10 = 1
		// to store reverse a number
			rev = rev *10 + rem ; // 432*10 + 1 = 4321
		// to eliminate last digit of a number
			n = n/10; //n = 1/10 = 0
		}
	System.out.println("Reverse = "+rev);
} }