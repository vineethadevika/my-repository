import java.util.*;
public class Circular_Prime {
static int prime(int n)// 113
{
	int flag = 1; //prime
	for(int i =2; i<=(n/2); i++)
	{
		if(n%i ==0)
		{
			flag = 0;
			break;
		}
	}
	if(flag == 0)
		return 0; // not prime
	else
		return 1; // prime
}
	
	static int circular_prime(int n)
	{
		// count digits in number
		int c=0,temp = n;
		while(temp != 0)//0 != 0
		{
			c++; // c= 3
			temp=temp/10; // temp = 1/10 = 0
		}
		//check prime
		int num =n; // num = 113
		while(prime(num) == 1) // prime
		{
			// permutations
			int rem = num%10; // rem =113%10 = 3
			int div = num/10; // div = 113/10 = 11
			//bring last digit to first
			num = (int)((Math.pow(10,c-1))*rem)+div;
					//10 pow 2 = 100*3 =300 + 11= 311
			// 131,113
			if (num == n)
				return 1; // prime
		}
		return 0;// not prime	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();// 113
		if(circular_prime(num)==1)
			System.out.println(num+" is Circular prime number");
		else
			System.out.println(num+" is Not Circular prime number");
	}
}
