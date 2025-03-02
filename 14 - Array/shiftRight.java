
public class shiftRight{
	public static void main(String[] args){
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		int temp = A[A.length-1];
		for(int i = A.length-1 ; i>0;i--){
			A[i] = A[i-1];
		}
		A[0] = temp;
		for(int i = 0 ; i<A.length;i++){
			if(i==0)System.out.print("[ ");
			System.out.print(A[i]+ ", ");
			if(i==A.length-1)System.out.print("]");
		}
	}
}