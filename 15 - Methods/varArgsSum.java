public class varArgsSum{
    public static void main(String[] args){
        System.out.println(sum(10,20,30,40));
    }

    static int sum(int ...A){
        int s=0;
        for(int i=0 ; i<A.length ; i++){
            s+= A[i];
        }
        return s;
    }
}