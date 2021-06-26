import java.util.*;
public class NearestPrime {
// check prime
static int prime(int n)
{
	int f =1; //prime
	for(int i=2; i<=(n/2); i++)
	{
		if(n%i==0)
		{
			f=0; // not prime
			break;
		}
	}
	if(f==1)
		return 1; // prime
	else
		return 0; // not prime
}
//before a number, prime?
static int beforePrime(int n)//14
{
	int c=0;
	while(true)
	{
		if( prime(n)==1)// prime
			return c; // 1
		else
		{
			n=n-1;//13
			c= c+1; // c= 1
		}			
	}
}
// after a number, prime?
static int afterPrime(int n)//14
{
	int c=0;
	while(true)
	{
		if( prime(n)==1)//17
			return c; //3
		else
		{
			n=n+1;//17
			c= c+1; // c= 3
		}			
	}
}
// driver method
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter number");
int n = sc.nextInt(); // 16
int m1 = beforePrime(n); // m1 =  3(13)
int m2 = afterPrime(n); // m2 = 1(17)
//nearest prime number
if(m1 > m2)
	System.out.println("Nearest Prime = "+(n+m2));
else if(m2 > m1)
	System.out.println("Nearest Prime = "+(n-m1));
else if( (n+m2) == (n-m1) )// (17==17)
	System.out.println("Prime Number = "+ n);
else if(m1 == m2)
	System.out.println("Nearest Primes are = "+
      (n-m1)+" "+(n+m2));
}

}