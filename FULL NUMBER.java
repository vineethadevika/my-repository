
package Numbers;
import java.util.*;
public class Full_number {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter  number: ");
		int num = obj.nextInt(); // 12345
		int n = num; // n = 12345
		int f = 1, d;
		while( num != 0)
		{
			d = num%10;
			num = num/10;
			if(n%2==0 && d%2==1)
			{ 
				f=2;
				break;
			}
			else if(n%2==1 && d%2==0)
			{
				f =2;
				break;
			}
		}
		if(f==1 && n%2==0)
			System.out.println("Full Even number");
		else if(f==1 && n%2==1)
			System.out.println("Full Odd number");
		else
			System.out.println("Mixed number");
	} }