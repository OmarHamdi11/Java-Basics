import java.util.Scanner;

public class array{
	public static void main(String[] args){
		int A[] = new int[10];
		int B[] = {1 , 2 , 3 , 4 , 5 };
		int C[];
		C = new int[10];
		B[2]=15;
		for(int x: B){System.out.println(x++);}
		for(int i =0 ; i<B.length;i++){
			B[i]++;
		}
		System.out.println("******************");
		for(int x: B){System.out.println(x++);}
		System.out.println("******************");
		System.out.println(B);
	}
}