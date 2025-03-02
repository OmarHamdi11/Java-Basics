//import java.lang.*;

public class StringMethods{
	public static void main(String args[]){
		String str1 = "      HelloWorld      ";
		int length = str1.length();
		String str2 = str1.toLowerCase();
		String str3 = str1.toUpperCase();
		String str4 = str1.trim();
		String str5 = str1.replace('l' , 't');
		String str6 = str1.substring(6,11);
		
		System.out.println(length);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}
}