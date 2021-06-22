package Numbers;
import java.util.*;
public class Count {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = obj.nextInt(); // 1234		
		int count =0;
		while(n != 0) // n= 1234, 123 , 12 , 1
		{			
			n = n/10; //n = 1/10 = 0
			count++; // 4
		}
System.out.println("No of Digits  = "+count);
	} }
