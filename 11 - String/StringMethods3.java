
public class StringMethods3{
	public static void main(String args[]){
		String str1 = "Omar";
		String str2 = "Omar";
		String str3 = new String("Omar");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(str1.equals(str3));
		System.out.println(str1==str3);
		
		String str4 = "Omar";
		String str5 = "omar";
		System.out.println(str4.compareTo(str5));
		System.out.println(str4.equalsIgnoreCase(str5));
		System.out.println(str4.equals(str5));
		
		String str6 = "Hello ";
		String str7 = "World";
		System.out.println(str6+str7);
		System.out.println(str6.concat(str7));
	}
}