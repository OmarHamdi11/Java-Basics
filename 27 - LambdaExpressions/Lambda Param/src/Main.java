
interface MyLambda{
    int add(int x , int y);
}

public class Main{
    public static void main(String[] args){
//      MyLambda m = (a,b)->{return a + b ;};
        MyLambda m = (a,b)->a + b;
        System.out.println(m.add(20,49));
    }
}