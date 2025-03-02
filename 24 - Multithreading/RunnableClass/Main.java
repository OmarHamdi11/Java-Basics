/*
class Mythread implements Runnable{
	public void run(){
		int x = 0 ;
		while(true){
			x++;
			System.out.println(x + "- Hello");
		}
	}
}

public class Main{
	public static void main(String[] args){
		Mythread m = new Mythread();
		Thread t = new Thread(m);
		t.start();
		
		int x =0;
		while(true){
			x++;
			System.out.println(x + "- World");
		}
	}
}
*/


public class Main implements Runnable{
	public void run(){
		int x = 0 ;
		while(true){
			x++;
			System.out.println(x + "- Hello");
		}
	}
	
	public static void main(String[] args){
		Main m = new Main();
		Thread t = new Thread(m);
		t.start();
		
		int x =0;
		while(true){
			x++;
			System.out.println(x + "- World");
		}
	}
}