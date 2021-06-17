package cond;
import java.util.*;
public class If_Else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year :");
		int year = sc.nextInt(); // 2013
if(((year % 4 ==0) && (year % 100 != 0) )|| (year % 400 == 0))
System.out.println("Leap Year = "+ year);
else
	System.out.println("Not Leap Year = "+ year);
	}
}