
public class RegularExpression{
	public static void main(String args[]){
		String str1 = "a";
		System.out.println(str1.matches("."));
		String str2 = "c";
		System.out.println(str2.matches("[abc]"));
		String str3 = "abc";
		System.out.println(str3.matches("abc"));
		String str4 = "4";
		System.out.println(str4.matches("[^abc]"));
		String str5 = "bz";
		System.out.println(str5.matches("[abc][vz]"));
		String str6 = "9";
		System.out.println(str6.matches("[a-z1-9]"));
		String str7 = "W";
		System.out.println(str7.matches("W|D"));
		String str8 = "5";
		System.out.println(str8.matches("\\d"));
		String str9 = "4";
		System.out.println(str9.matches("\\D"));
		String str10 = " ";
		System.out.println(str10.matches("\\s"));
		String str11 = " ";
		System.out.println(str11.matches("\\S"));
		String str12 = "t";
		System.out.println(str12.matches("\\w"));
		String str13 = "t";
		System.out.println(str13.matches("\\W"));
		
	}
}