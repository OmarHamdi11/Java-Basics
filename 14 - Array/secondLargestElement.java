
public class secondLargestElement{
	public static void main(String[] args){
		int A[] = {46,7,23,7,34,89,42,57,42,78,26,67};
		int max = A[0];
		int max2 = A[0];
		for(int i = 0 ; i<A.length;i++){
			if(A[i]>= max){
				max2=max;
				max=A[i];
			}
			else if(A[i]>=max2){
				max2=A[i];
			}
		}
		System.out.println("Second Largest Element is: " + max2 );
	}
}