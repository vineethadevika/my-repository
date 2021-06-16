package Numbers;
import java.util.*;
public class Palin_Num {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 2 Numbers:");
		int n1 = obj.nextInt(); // 1
		int n2 = obj.nextInt(); // 100
		
		for(int i = n1; i <= n2; i++)
		{
			if(display(i)==1)
				System.out.print(i+" ");
		}
	}
static int display(int i)
{
	int n = i; // n = 3553
		int rev =0, rem;	

		while(n > 0) // 3553, 355, 35, 3,0
		{
			rem = n%10;
			rev = rev * 10  + rem;
			n = n/10; // 3553/10 = 355
		}
		if( i == rev )
		 return 1;
		else
		 return 0;		
	}}
