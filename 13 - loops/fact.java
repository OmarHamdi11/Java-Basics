import java.util.Scanner;
public class fact
{
	public static void main(String[] args) {
		int fact=1 , num;
		System.out.println("Enter number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i = 1 ; i<=num ; i++)
		    fact = fact*i;
		System.out.println("Fact is = " + fact);
	}
}