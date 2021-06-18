package Numbers;
import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a = obj.nextInt(); // 2
		int b = obj.nextInt(); // 3
		
		int gcd =1;
		
		for(int i=1; i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
				gcd = i; // gcd = 1
		}
		int lcm = (a*b)/gcd;
System.out.println("LCM = "+lcm);
	} }
