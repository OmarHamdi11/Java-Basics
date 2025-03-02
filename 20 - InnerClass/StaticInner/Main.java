class Outer{
	int x = 10;
	static int y = 20;
	static class My{
		void show(){
			System.out.println(y);
		}
	}
}

public class Main{
	public static void main(String[] args){
		Outer.My m = new Outer.My();
		m.show();
	}
}