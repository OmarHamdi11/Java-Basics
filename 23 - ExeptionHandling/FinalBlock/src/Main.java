
public class Main{
    static void meth1() throws Exception{
        try{
            throw new Exception("اى حاجه");
        }
        finally{
            System.out.println("Finally Message");
        }
    }

    public static void main(String[] args) throws Exception{
        meth1();
    }
}