class NegativeDimentionsException extends Exception {
    @Override
    public String toString(){
        return "Negative Dimentions Exception";
    }
}

public class Main {
    static int area(int x  , int y) throws NegativeDimentionsException{
        if(x<0 || y<0){
            throw new NegativeDimentionsException();
        }
        return x*y;
    }

    static void meth1() throws NegativeDimentionsException{
        System.out.println("Area= " + area(-10,5));
    }

    public static void main(String[] args){
        try{
            meth1();
        } catch (NegativeDimentionsException e) {
            System.out.println(e.toString());
        }
    }
}