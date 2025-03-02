import java.util.Scanner;

public class digitNumbers{
	public static void main(String[] args){
		int num , r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		while(num>0){
			r = num%10;
			System.out.println(r);
			num = num/10;
		}
	}
}