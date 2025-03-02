class Test{
	static int x=10;
	int y=20;
	public void show(){
		System.out.println(x+" "+y);
	}
	public static void display(){
		System.out.println(x);
	}
}

public class Main{
	public static void main(String[] args){
		Test t1 = new Test();
		t1.show();
		
		Test t2 = new Test();
		t2.show();
		System.out.println("**********************");
		
		t1.x=30;
		t1.y=70;
		
		t1.show();
		t2.show();
	}
}