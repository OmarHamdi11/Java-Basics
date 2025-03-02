
public class RegularExpression2{
	public static void main(String args[]){
		String str1 = "aabbcbcba";
		System.out.println(str1.matches("[abc]*"));
		
		String str2 = "abccba";
		System.out.println(str2.matches("[abc]{3,7}"));
		
		String str3 = "omarellafy1@gmail.com";
		System.out.println(str3.matches(".*gmail.*"));
	}
}