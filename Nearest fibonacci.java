import java.util.*;
public class Nearest_Fibo {

	static boolean fibo(int n)// n= 6
	{
		int t1 = 0, t2 = 1, sum =0;
		while(sum < n) // 0,1,1,2,3,5 -> t, 5 ->f
		{
			sum = t1+t2; // 8
			t1 = t2;
			t2=sum; 
		}
		if (sum == n)
			return true; // 5 fibo
		else
			return false;  // 6 not fibo
	}
	
	static int beforeFibo(int n) //n = 6
	{
		int c = 0;
		while(true)
		{
			if(fibo(n))
				return c;
			else
			{
				n= n-1; // 6-1 = 5
				c++; // c= 1
			}				
		}
	}
	
	static int afterFibo(int n) // 6 
	{
		int c = 0;
		while(true)
		{
			if(fibo(n))// 8-> t
				return c; // 2
			else
			{
				n= n+1; // 7+1 = 8
				c++; // c= 2
			}				
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt(); // 6
		int m1 = beforeFibo(n);// m1 = 1
		int m2 = afterFibo(n);// m2 = 2
		if(m1 > m2)
			System.out.println("Nearest Fibo="+(n+m2));
		else if (m2 > m1)
			System.out.println("Nearest Fibo="+(n-m1));
		else if( (n-m1)==(n+m2) ) // 5==5
			System.out.println("Nearest Fibo="+n);
		else if(m1==m2) // n = 4
			System.out.println("Nearest Fibo="+(n-m1)+" "+(n+m2));

	}

}