package Pack1;
import java.util.*;
public class student_details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sno: ");
		byte sno = sc.nextByte();
		System.out.println("Enter sname: ");
		String sna = sc.next();
		System.out.println("Enter marks: ");
		int marks = sc.nextInt();
		System.out.println("Enter fee: ");
		float fee = sc.nextFloat();	
		System.out.println("Student Details: ");
		System.out.println("---------------- ");
		System.out.println("Sno = "+sno+"\nsname = "+sna+
				"\nmarks = "+marks+"\nfee = "+fee);
	}
}