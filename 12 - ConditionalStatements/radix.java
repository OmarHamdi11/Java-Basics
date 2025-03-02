import java.util.Scanner;

public class radix{
	public static void main(String[] args){
		String num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextLine();
		
		if(num.matches("[01]+")){
			System.out.println("Binary Number");
		}
		else if(num.matches("[0-7]+")){
			System.out.println("Octal Number");
		}
		else if(num.matches("[0-9]+")){
			System.out.println("Decimal Number");
		}
		else if(num.matches("[0-9A-f]+")){
			System.out.println("Hexa Number");
		}
		else{
			System.out.println("Wrong Number");
		}
	}
}