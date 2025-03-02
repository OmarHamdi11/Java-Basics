
public class challenge2{
	public static void main(String args[]){
		int b = 10101;
		String str1 = String.valueOf(b);
		System.out.println("Is it binary ? => " + str1.matches("[01]+"));

		String str2 = "234AB";
		System.out.println("Is it Hexa ? => " + str2.matches("[0-9A-F]+"));

		String str3 = "16/8/2003";
		System.out.println("Is it date ? => " + str3.matches("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}"));

	}
}