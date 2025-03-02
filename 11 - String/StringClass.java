
public class StringClass {
	public static void main(String args[]){
		String str1="Java Program";
        	System.out.println(str1);
		
		char c[] = {'H','e','l','l','o'};
		String str2 = new String(c,2,2);
		System.out.println(str2);
		
		byte b[] = {65,66,67,68};
		String str3 = new String(b,2,1);
		System.out.println(str3);
		
		String str4 = new String("Java");
		System.out.println(str4);
		
		
		String str5="Java";
        	//String str6="Java";
        	String str7=new String("Java");
        	System.out.println(str5==str7);
		
	}
}