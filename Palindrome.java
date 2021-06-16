package Numbers;
import java.util.*;
public class Palin_Num {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = obj.nextInt(); // 3553
		int rev =0, rem;
		int x = num; // x = 3553

		while(num != 0) // 3553, 355, 35, 3,0
		{
			rem = num%10;
			rev = rev * 10  + rem;
			num = num/10; // 3553/10 = 355
		}
		if( x == rev )
		 System.out.println(x + " is Palindrome");
		else
		System.out.println(x + " is not Palindrome");		
	}}