import java.lang.*;

public class Literals {

    public static void main(String[] args) {
        byte b1=10;
        byte b2=0b1010;
        byte b3=012;
        byte b4=0XA;
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
	System.out.println("#####################");

	byte b = 15;
	short s = 15;
	int i =15;
	long l = 9_999_999l;

	float f = 23.45f;
	double d = 2_847_643.455d;

	char c = 'G';

	boolean n = true;
	
	System.out.println(b);
	System.out.println(s);
	System.out.println(i);
	System.out.println(l);
	System.out.println(f);
	System.out.println(d);
	System.out.println(c);
	System.out.println(n);
    }
    
}