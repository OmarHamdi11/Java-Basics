
interface MyLambda{
    void display(String str);
}

class Demo{
    public void rev(String str){
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        System.out.println(s);
    }
}

public class Main{
    public static void main(String[] args){
        // Static method Referencing
        MyLambda ml = System.out::println;
        ml.display("Method Referencing");

        Demo d = new Demo();
        MyLambda ml2 = d::rev;
        ml2.display("Hello");
    }
}