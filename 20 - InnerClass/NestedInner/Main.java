
class Outer {
	public int x=10;
	class Inner{
		int y = 20;
		void innerDisplay(){
			System.out.println("x= "+x+"\ny= "+y);
			System.out.println("Inner Display");
		}
	}
	void outerDisplay(){
		Inner i = new Inner();
		i.innerDisplay();
		System.out.println("**********Outer Display**********");
	}
}

public class Main{
	public static void main(String[] args){
		Outer o = new Outer();
		o.outerDisplay();
		Outer.Inner i = new Outer().new Inner();
		i.innerDisplay();
	}
}