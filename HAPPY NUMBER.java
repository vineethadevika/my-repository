
package Numbers;
import java.util.*;
public class Happy {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt(); // 32
		int result = num; // result = 32
		Happy obj = new Happy();
		while(result != 1 && result != 4)
		{
			result =  obj.display(result); // recursive
		}
		if(result == 1)
			System.out.println(num + " is a Happy Number");
		else
			System.out.println(num + " is Not Happy Number");
	} // main
	
	int display(int num) // num = 32, 13, 10
	{
		int sum = 0 ;
		while(num > 0)
		{
			int rem = num%10;
			sum = sum + (rem*rem);
			num = num/10;
		}
		return sum; // sum 13, 10, 1
	}//display
}// class