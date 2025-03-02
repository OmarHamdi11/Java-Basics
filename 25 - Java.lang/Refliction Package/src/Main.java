import java.lang.reflect.*;

class My {
    public String name;
    protected int num;
    private String id;
    int social;

    public My(){}

    public My(int x , int y){}

    public void meth1(){}

    public int meth2(int cNum , String cName ) {return 0;}

}

public class Main{
    public static void main(String[] args){
        Class c = My.class;
        System.out.println(c.getName());

        Constructor[] con = c.getConstructors();
        for(Constructor ct : con)
            System.out.println(ct);

        Field[] f = c.getDeclaredFields();
        for(Field fd:f)
            System.out.println(fd);

        Method[] m = c.getMethods();
        for(Method mt:m)
            System.out.println(mt);

        Parameter[] p = m[0].getParameters();
        for(Parameter pt:p)
            System.out.println(pt);
    }
}