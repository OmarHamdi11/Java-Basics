import java.util.Scanner;

public class switchWebsite{
	public static void main(String[] args){
		String domain;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter domain name : ");
		domain = sc.nextLine();
		
		String ext = domain.substring(domain.lastIndexOf(".")+1);
		
		switch(ext)
		{
			case "com": System.out.println("Commercial");
				break;
			case "gov": System.out.println("Government");
				break;
			case "net": System.out.println("Network");
				break;
			case "org": System.out.println("Organization");
				break;
			default: System.out.println("Invalid Input");
				break;
		}
	}
}