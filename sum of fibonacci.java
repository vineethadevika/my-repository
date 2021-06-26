import java.util.*;
public class Fibonacci_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt(); // n = 9 		
		int t1 = 0,t2 =1, sum=0, total=1;		
		for(int i = 3; i<= n; i++)
		{			
			sum = t1+t2; // 1
			total = sum + total;// total = 2
			t1 = t2;
			t2 = sum;			
		}
		System.out.print("total = "+ total); // 54
	} }