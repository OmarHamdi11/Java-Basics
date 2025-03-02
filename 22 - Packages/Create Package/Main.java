import myPack1.Demo;
import myPack1.Demo2;
import myPack1.inner.Demo3;


public class Main{
	public static void main(String[] args){
		Demo d = new Demo();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		d.display();
		
		d2.display();
		
		d3.display();
		
	}
}