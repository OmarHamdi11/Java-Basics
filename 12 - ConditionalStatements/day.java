import java.util.Scanner;

public class day{
	public static void main(String[] args){
		int dayNum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day's Number : ");
		dayNum = sc.nextInt();
		
		if(dayNum == 1){
			System.out.println("Saturday");
		}
		else if(dayNum == 2){
			System.out.println("Sunday");
		}
		else if(dayNum == 3){
			System.out.println("Monday");
		}
		else if(dayNum == 4){
			System.out.println("Tuseday");
		}
		else if(dayNum == 5){
			System.out.println("Wednesday");
		}
		else if(dayNum == 6){
			System.out.println("Thursday");
		}
		else if (dayNum == 7){
			System.out.println("Friday");
		}
		else{
			System.out.println("Invalid day number");
		}
	}
}