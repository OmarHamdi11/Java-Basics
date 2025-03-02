
public class challenge3{
	public static void main(String args[]){
		String str = "a!B@c#1$2%3";
		str = str.replaceAll("[^a-zA-Z0-9]*", "");
		System.out.println(str);

		String str2 = "eng     omar     hamdi     ellafy";
		str2 = str2.replaceAll("\\s+", " ").trim();
		System.out.println(str2);

		String str3 = "eng     omar     hamdi     ellafy";
		str3 = str3.replaceAll("\\s+", " ").trim();
		String words[] = str3.split("\\s");
		System.out.println(words.length);
	}
}