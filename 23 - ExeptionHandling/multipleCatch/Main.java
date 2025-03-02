
public class Main{
	public static void main(String[] args){
		int a[] = {40,30,20,10,0};
		
		try{
			
			int c = a[0]/a[2];
			System.out.println("DIV= " + c );
			
			System.out.println(a[6]);
			
		} catch (ArithmeticException e){
			
			System.out.println("Error: " + e.getMessage());
			
		} catch (ArrayIndexOutOfBoundsException e){
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
		System.out.println("Bye!!");
		
		
	}
}