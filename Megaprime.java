import java.util.*;
public class Mega_Prime 
{
	//check prime number
	static int prime(int n) // 53,35,23,27
	{
		int i=0, flag = 1;  // prime
		if(n==0||n ==1)
			return 0; // not prime
		else
		{
			for(i=2; i<=n/2;i++ )
			{
				if((n%i)==0)
				{
					flag = 0; // not prime
					break;
				}// if
			}// for
	     }//else
		
		if (flag == 0)
			return 0; // not prime
		else
			return 1; // prime
	}
	
	// check for mega prime
	static int megaPrime(int n) // n = 53
	{
		int rem =0, flag = 1; // prime
		if( prime(n) == 0 ) // check 53 is prime
			return 0; // not prime
		else // prime
		{
			while(n != 0) // n= 53
			{
				rem = n%10; // rem = 3
				flag = prime(rem); // check 3 is prime
				if(flag == 0)
					return 0; // not prime
					n=n/10; // n= 53/10 = 5
			}			
		}
		if(flag == 1)
			return 1 ; //mega prime
		else
			return 0; // not mega prime			
	}	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt(); // 53
		
		int n  = megaPrime(num);
		
		if (n==1)
			System.out.println(num+" is Mega Prime");
		else
			System.out.println(num+" is Not Mega Prime");
} }