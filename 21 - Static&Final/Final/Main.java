class Test{
    public void show(){
        System.out.println("Hello");
    }
}

class Test2 extends Test{      //Cannot inherit from final 'Test'
    // public void show(){}  'show()' cannot override 'show()' in 'Test'; overridden method is final
}

public class Main{
    static final float PI ;
    static
    {
        PI = 3.14f;
    }
    public static void main(String[] args){
        System.out.println(PI);
    }
}