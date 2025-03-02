import java.util.Scanner;

public class switchDay{
	public static void main(String[] args){
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day number : ");
		day = sc.nextInt();
		
		switch(day)
		{
			case 1: System.out.println("SAT");
				break;
			case 2: System.out.println("SUN");
				break;
			case 3: System.out.println("MON");
				break;
			case 4: System.out.println("TUS");
				break;
			case 5: System.out.println("WED");
				break;
			case 6: System.out.println("THU");
				break;
			case 7: System.out.println("FRI");
				break;
			default : System.out.println("Invalid input");
		}
		
	}
}