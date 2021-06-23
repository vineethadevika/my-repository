package Numbers;
import java.util.*;
public class Semi_prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 8
		int x = num; // x = 8
		int c = 0;
		for(int i = 2; c < 2 && i*i <= num; i++)
		{
			while(num%i ==0)//8%2==0,4%2==0,2%2==0
			{
				num= num/i; // 2/2 == 1
				++c; // c = 3
			}
		}
		if (num>1)
		{ ++c; }
		if (c == 2)
			System.out.println(x+" is semiprime");
		else
			System.out.println(x+" is not semiprime");			
} }