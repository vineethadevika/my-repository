import java.util.*;
public class Twin_Primes {
	static int prime(int n)
	{
		int f = 1;
		for(int i=2; i<=(n/2); i++)
		{
			if(n%i==0)
				f=0;
			break;
		}
		return 1;
	}		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("enter 2 numbers:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if(prime(n1)==1 && prime(n2)==1 && (n2-n1==2))
			System.out.println("Twin prime Numbers");
		else
			System.out.println("Not Twin prime Numbers");
	}
}