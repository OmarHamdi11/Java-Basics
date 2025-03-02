class SuperClass{
	public void meth1(){System.out.println("Super meth1");}
	public void meth2(){System.out.println("Super meth2");}
}

class SubClass extends SuperClass{
	@Override
	public void meth2(){System.out.println("Sub meth2");}
	public void meth3(){System.out.println("Sub meth3");}
}

public class Main{
	public static void main(String[] args){
		SuperClass sup = new SuperClass();
		sup.meth1();
		sup.meth2();
		
		SubClass sub = new SubClass();
		sub.meth2();
		sub.meth3();
		
		SuperClass s = new SubClass();
		s.meth1();
		s.meth2();
	}
}