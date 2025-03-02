import java.lang.*;

public class FormatSpecifier{
	public static void main(String args[]){
		int x = 10;
		float y = 12.34f;
		char z = 'A';
		
		System.out.printf("%3$-20c %2$6.4f %1$15o " , x, y , z);
	}
}