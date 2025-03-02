import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int x,y,z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two Numbers: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		try{
			
		z=x/y;
		System.out.println(z);
		
		} catch (ArithmeticException e){
			
			System.out.println(e);
			
		}
		
		System.out.println("End of File");
	}
}