class SuperClass{
	public void display(){
		System.out.println("Super Class Display");
	}
}

class SubClass extends SuperClass{
	@Override
	public void display(){
		System.out.println("Sub Class diaplay");
	}
}

public class Main{
	public static void main(String[] args){
		SuperClass sup = new SuperClass();
		sup.display();
		
		SubClass sub = new SubClass();
		sub.display();
		
		SuperClass s = new SubClass();
		s.display();
	}
}