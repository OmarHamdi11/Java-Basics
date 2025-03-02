
public class method {
	
	public static void main(String[] args){
		int a = 10 , b = 15 , c ;
		c = max(a , b);
		System.out.println( c );

		inc(a);
		System.out.println(a);
	}

	static int max (int x , int y){
		if(x > y){
			return x;
		}
		else{
			return y;
		}
	}

	static void inc (int x){
		x++;
		System.out.println(x);
	}
}