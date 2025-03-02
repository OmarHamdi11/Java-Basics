import java.util.Scanner;

public class leapYear{
	public static void main(String[] args){
		int year;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year : ");
		year = sc.nextInt();

		if(year%4 == 0){
			if(year%100 == 0){
				if(year%400 == 0){
					System.out.println("Leap Year");
				}
				else{
					System.out.println("Not Leap Year");
				}
			}
			else{
				System.out.println("Leap Year");
			}
		}
		else{
			System.out.println("Not Leap Year");
		}
	}
}