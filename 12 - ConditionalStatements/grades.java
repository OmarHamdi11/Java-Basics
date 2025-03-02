import java.util.Scanner;

public class grades{
	public static void main(String[] args){
		int sub1,sub2,sub3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your grades : ");
		System.out.print("Subject1 : ");
		sub1 = sc.nextInt();
		System.out.print("Subject2 : ");
		sub2 = sc.nextInt();
		System.out.print("Subject3 : ");
		sub3 = sc.nextInt();

		float avg = ((float)sub1+sub2+sub3)/3;
		if(avg>=70){
			System.out.println("Grade : A " + avg);
		}
		else if(70>avg && avg>=60){
			System.out.println("Grade : B " + avg);
		}
		else if(60>avg && avg>=50){
			System.out.println("Grade : C " + avg);
		}
		else if(50>avg && avg>=40){
			System.out.println("Grade : D " + avg);
		}
		else{
			System.out.println("Grade : F " + avg);
		}
	}
}