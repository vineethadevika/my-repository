package cond;
import java.util.*;
public class If_Else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt(); 			
String x = (n % 2 == 0) ? "even number" : "odd number";		
System.out.println(x);
}
}