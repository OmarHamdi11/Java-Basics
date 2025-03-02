import java.lang.*;

class MyObject {
    int instanceNum = 0;
    static int count = 0;
    public MyObject(){
        count++;
        instanceNum = count;
    }

    public int hashCode(){
        return 100;
    }

    public boolean equals(Object obj){
        return this.hashCode() == obj.hashCode();
    }

    public String toString(){
        return "Object Instance " + instanceNum;
    }
}

public class Main{
    public static void main(String[] args){
        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o1.equals(o2));
        System.out.println(o1);
        System.out.println(o2);
    }
}