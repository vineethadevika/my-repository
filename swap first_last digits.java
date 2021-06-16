package Numbers;
import java.util.*;
public class Swap_Digits {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = obj.nextInt(); // 12345
		
		int ld = n%10; // 12345%10 = 5
		
		int d = (int)Math.log10(n); 
		//no. of digits-1 = 4
		
		int fd = (int)(n/Math.pow(10, d));
		// 12345/10000 = 1
		
		int rev = ld; // rev = 5
		rev = rev * (int)(Math.pow(10,d));
		// 5 * 10000 = 50000
		
		rev = rev + n%(int)(Math.pow(10, d));
		// 50000 + (12345%10000) 
		// 50000 + 2345 = 52345
		
		rev= rev - ld;
		// rev = 52345 - 5 = 52340
		
		rev = rev + fd;
		// rev = 52340 + 1 = 52341
System.out.println("Swapped number = "+ rev);
	} }