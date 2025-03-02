import java.util.Scanner;

public class menuDrivenProgram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		String op;
		
		System.out.println("Enter two Numbers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.nextLine();

		
		System.out.println("Operations: ADD - SUB - DIV - MUL ");
		System.out.println("Enter the operation in words: ");
		op = sc.nextLine();
		op = op.toUpperCase();
		
		switch(op)
		{
			case "ADD": System.out.println(num1+num2);
				break;
			case "SUB": System.out.println(num1-num2);
				break;
			case "MUL": System.out.println(num1*num2);
				break;
			case "DIV": System.out.println(num1/num2);
				break;
		}
		
	}
}