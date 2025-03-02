
abstract class Super{
	Super(){
		System.out.println("Super Constractor");
	}
	public void meth1(){
		System.out.println("Super meth1");
	}
	abstract void meth2();
}

class Sub extends Super{
	Sub(){
		System.out.println("Sub Constractor");
	}
	void meth2(){
		System.out.println("Sub Override meth2");
	}
}

public class Main{
	public static void main(String[] args){
		Sub s1 = new Sub();
	}
}