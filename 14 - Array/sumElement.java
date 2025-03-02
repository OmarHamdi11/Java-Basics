import java.util.Scanner;

public class sumElement{
	public static void main(String[] args){
		int A[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };
		int sum = 0;
		for(int x: A){sum+=x;}
		System.out.println("Sum of array elements= "+sum);
	}
}