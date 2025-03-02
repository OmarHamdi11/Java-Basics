import java.util.Scanner;

public class elements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter Element: ");
		int element = sc.nextInt();
		for(int x : A){
			if(x == element){
				System.out.println("Found");
				System.exit(0);
			}
		}
		System.out.println("Not Found");
		
	}
}