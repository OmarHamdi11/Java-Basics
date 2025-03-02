
public class maxElement{
	public static void main(String[] args){
		int A[] = {46,7,23,7,34,89,42,57,42,78,26,67};
		int max = A[0];
		for(int i = 0 ; i<A.length;i++){
			if(A[i]>= max){
				max=A[i];
			}
		}
		System.out.println("Max Element is: " + max );
	}
}