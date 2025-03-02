
public class max{
    public static void main(String[] args){
        int A[] = {4,5,9,2,3};
        int maxValue = maxElement(A);
        System.out.println("Max array element is:" + maxValue);
    }

    static int maxElement(int A[]){
        int temp = A[0];
        for(int i = 0 ; i<A.length ; i++){
            if(A[i] >= temp){
                temp = A[i];
            }
        }
        return temp;
    }
}