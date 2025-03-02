class Parent{
	Parent(){System.out.println("Parent class constructor");}
}


class Child extends Parent{
	Child(){System.out.println("Child class constructor");}
}

public class Main{
	public static void main(String[] args){
		Child p1 = new Child();
	}
}