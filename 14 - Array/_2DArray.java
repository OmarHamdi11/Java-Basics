
public class _2DArray{
	public static void main(String[] args){
		int A[][] = new int[3][4];
		
		int B[][] = {{1,2,3,4},{2,4,6,8},{3,5,7,9}};
		
		// Creating 2d Array
		int [][]X=new int[5][5];
		int []D[]=new int[5][5];
		
		//E is a 2D array and F is a 1D array
		int[] E[],F;
		E=new int[5][5];
		F=new int[5];
        	
		//G H and I are 1D arrays
		int[] G,H,I;
		
		
		for(int i = 0 ; i < B.length ; i++){
			for(int j = 0 ; j < B[i].length ; j++){
				System.out.print(B[i][j]+ " ");
			}
			System.out.println("");
		}
		
		for(int x[] : B){
			for(int y : x){
				System.out.print(y + " ");
			}
			System.out.println("");
		}
		
		System.out.println("*****************************");
		
		// Jagged Arrar
		int C[][];
		C = new int[3][];
		C[0] = new int[4];
		C[1] = new int[8];
		C[2] = new int[6];
		
		
		for(int i = 0 ; i < C.length ; i++){
			for(int j = 0 ; j < C[i].length ; j++){
				System.out.print(C[i][j]+ " ");
			}
			System.out.println("");
		}
		
		for(int x[] : C){
			for(int y : x){
				System.out.print(y + " ");
			}
			System.out.println("");
		}
		
		
	}
}