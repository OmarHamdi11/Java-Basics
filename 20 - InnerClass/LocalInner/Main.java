class Outer{
	void display(){
		class Inner{
			void show(){
				System.out.println("Hello Local Class");
			}
		}
		//Inner i = new Inner();
		//i.show();
		new Inner().show();
	}
}

public class Main{
	public static void main(String[] args){
		//Outer o = new Outer();
		//o.display();
		new Outer().display();
	}
}