
interface test{
	public void meth1();
	public void meth2();
}

class test2 implements test{
	public void meth1(){
		System.out.println("Meth1 class test2");
	}
	public void meth2(){
		System.out.println("Meth2 class test2");
	}
	public void meth3(){
		System.out.println("Meth3 class test2");
	}
}

public class Main{
	public static void main(String[] args){
		test t= new test2();
		t.meth1();
		t.meth2();
	}
}