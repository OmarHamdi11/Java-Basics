class Tv{
	public void switchOn(){System.out.println("TV is switched on");}
	public void changeChannel(){System.out.println("TV channel is changed");}
}

class SmartTv extends Tv{
	@Override
	public void switchOn(){System.out.println("Smart TV is switched on");}
	@Override
	public void changeChannel(){System.out.println("Smart TV channel is changed");} 
	public void browse(){System.out.println("Smart TV browsing");}
}

public class Main{
	public static void main(String[] args){
		Tv t = new Tv();
		t.switchOn();
		
		SmartTv st = new SmartTv();
		st.switchOn();
	}
}