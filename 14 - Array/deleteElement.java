
public class deleteElement{
	public static void main(String[] args){
		int A[] = new int[10];
		A[0]=1;A[1]=2;A[2]=3;A[3]=4;A[4]=5;A[5]=6;

		int numOfElements=6;
		for(int i = 0 ; i < numOfElements ; i++ ){
			System.out.print(A[i]+", ");
		}
		System.out.println(" ");

		int deletingIndex = 2;
		for(int i = deletingIndex ; i<numOfElements ; i++){
			A[i] = A[i+1];
		}

		for(int i = 0 ; i < numOfElements ; i++ ){
			System.out.print(A[i]+", ");
		}
		System.out.println(" ");
	}
}