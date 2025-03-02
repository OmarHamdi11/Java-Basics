public class increaseArraySize{
	public static void main(String[] args){
		int A[] = {1,2,3,4,5};
		System.out.println("Array size = " + A.length);
		
		int B[] = new int[2*A.length];
		
		for(int i = 0 ; i < A.length ; i++ ){
			B[i] = A[i];
		}
		
		A = B;
		B = null;
		
		System.out.println("New Array Size = " + A.length);
	}
}