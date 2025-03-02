
interface MyLambda{
    void display();
}

class Demo{
    int count2 = 23;
    void meth1(){
        int count = 0 ;
        MyLambda m = ()->{
            int x=10;
            System.out.println("Try" + count + x + count2++);
            System.out.println("Capture in lambda");
        };
    }

    void call(MyLambda m){
        m.display();
    }
}

public class Main {
    public static void main(String[] args){
        Demo d= new Demo();
        d.call(()->System.out.println("Lambda as parameter"));
    }
}