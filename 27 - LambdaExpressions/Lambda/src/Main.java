
@FunctionalInterface
interface MyLambda{
    void display();
}

public class Main{
    public static void main(String[] args){
        MyLambda m1 = new MyLambda(){
            public void display(){
                System.out.println("Anonymous Class");
            }
        };

        MyLambda m2 = ()->{System.out.println("Lambda Expression");};

        m1.display();
        m2.display();

    }
}