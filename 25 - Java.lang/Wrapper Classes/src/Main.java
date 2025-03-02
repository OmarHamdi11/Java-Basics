
public class Main {
    public static void main(String[] args) {
        System.out.println("Integer Class");
        Integer a = new Integer(10);
        Integer b = Integer.valueOf(11);
        Integer c = 12;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("#################################");
        System.out.println("Byte Class");
        Byte d = new Byte("13");
        Byte e = 14;
        byte fg = 15;
        Byte f = Byte.valueOf(fg);
        Byte g = Byte.valueOf("16");
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        System.out.println("#################################");
        System.out.println("Short, long, folat, double, char, boolean Class");

        Short h = Short.valueOf((short) 17);
        System.out.println(h);

        Long i = 32763l;
        System.out.println(i);

        Float j = 5876.3f;
        System.out.println(j);

        Double k = 47568.3;
        System.out.println(k);

        Character l = 'f';
        System.out.println(l);

        Boolean m = true;
        System.out.println(m);

        System.out.println("#################################");
        System.out.println("autoBoxing & AutoUnboxing Class");

        int n = 90;
        Integer o = n; // autoBoxing
        int p = o;  // autoUnboxing

    }
}