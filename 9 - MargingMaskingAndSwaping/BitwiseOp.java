import java.lang.*;
import java.util.Scanner;

public class BitwiseOp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a ;
		int b ;
		
		System.out.println("Enter first number 'a' : ");
		a = sc.nextInt();
		System.out.println("Enter second number 'b' : ");
		b = sc.nextInt();
		
		a = a^b;
		b = a^b;
		a = a^b;

		System.out.println("first number 'a' = " + a);
		System.out.println("second number 'b' = " + b);
	}
}