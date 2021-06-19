package Pack1;
import java.util.*;
public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		float r = sc.nextFloat();
		float a = 3.14f*r*r;
		System.out.println("Area = " + a);
	}
}