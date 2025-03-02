

class Super{
    public void display(){}

    @Deprecated
    public void show(){}

    @SafeVarargs
    private void play(String... varArg){

    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Sub class");
    }
}

@FunctionalInterface
interface My{
    public void show();
//    public  int add(int x,int y);
}



public class Main{
    public static void main(String[] args){
        @SuppressWarnings("deprecation")
        Super s1 = new Super();
        s1.show();


    }
}