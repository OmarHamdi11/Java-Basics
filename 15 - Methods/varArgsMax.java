
public class varArgsMax{
    public static void main(String[] args){
        int m = max(10,100,54,7543,4567,38);
        System.out.println("Max: " + m);
        m = max();
        System.out.println("Max: " + m);
    }
    static int max(int ...A){
        if(A.length == 0 ){return Integer.MIN_VALUE;}
        int max = A[0];
        for(int i=0 ; i<A.length ; i++){
            if(A[i] > max ){max=A[i];}
        }
        return max;
    }
}