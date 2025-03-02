
public class shiftLeft{
	public static void main(String[] args){
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		int temp = A[0];
		for(int i = 1 ; i<A.length;i++){
			A[i-1] = A[i];
		}
		A[A.length-1] = temp;
		for(int i = 0 ; i<A.length;i++){
			if(i==0)System.out.print("[ ");
			System.out.print(A[i]+ ", ");
			if(i==A.length-1)System.out.print("]");
		}
	}
}