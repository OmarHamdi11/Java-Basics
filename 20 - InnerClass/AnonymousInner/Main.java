abstract class My {
	abstract public void show();
}

class Outer{
	void display(){
		//My m = new My(){public void show(){System.out.println("Hello anonymous inner class");} }; // anonymous class
		//m.show();
		new My(){public void show(){System.out.println("Hello anonymous inner class");}}.show();    // anonymous object
	}
}

public class Main{
	public static void main(String[] args){
		//Outer o = new Outer();
		//o.display();
		new Outer().display();
	}
}