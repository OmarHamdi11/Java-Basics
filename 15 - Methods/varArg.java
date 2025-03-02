
public class varArg{
    public static void main(String ...args){
        showList(5,"Omar","Osman","Ali","Hamdi");
    }

    static void showList(int start , String ...A){
        for(int i=0 ; i< A.length ; i++){
            System.out.println(start++ + ". " +A[i]);
        }
    }

}