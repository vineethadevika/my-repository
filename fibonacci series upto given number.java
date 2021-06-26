import java.util.*;
public class Fibonacci_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt(); // 10
		
		int t1 = 0,t2 =1;
		System.out.println("Fibonacci Series:");
		System.out.print(t1 +" "+t2);// 0 1 
		
		for(int i = 3; i<= n; i++)
		{
			int sum = t1+t2; // sum = 1,2
			System.out.print(" "+sum); // 0 1 1 2
			t1 = t2;
			t2 = sum;
		}
	} }