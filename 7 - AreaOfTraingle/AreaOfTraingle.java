import java.lang.*;
import java.util.Scanner;

public class AreaOfTraingle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a , b , c;
		float s , area;
		
		System.out.println("Enter three parameters: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		s = (a+b+c)/2f;
		
		area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Traingle Area is = " + area);
		
	}
}
