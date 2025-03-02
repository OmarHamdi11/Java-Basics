class phone{
	public void call(){System.out.println("phone call");}
	public void sms(){System.out.println("phone send sms");}
}

interface ICamera{
	void click();
	void record();
}

interface IMusicPlayer{
	void play();
	void stop();
}

class SmartPhone extends phone implements ICamera , IMusicPlayer {
	public void videoCall(){System.out.println("Smart phone video call");}
	
	public void call(){System.out.println("Smart phone call");}
	public void sms(){System.out.println("smart phone call");}
	
	public void click(){System.out.println("Smart phone click");}
	public void record(){System.out.println("Smart phone record");}
	
	public void play(){System.out.println("Smart phone play");}
	public void stop(){System.out.println("Smart phone stop");}
}


public class Main{
	public static void main(String[] args){
		SmartPhone sp = new SmartPhone();
		sp.videoCall();
		sp.call();
		sp.sms();
		sp.click();
		sp.record();
		sp.play();
		sp.stop();
		
		phone p = new SmartPhone();
		p.call();
		p.sms();
		
		ICamera c = new SmartPhone();
		c.click();
		c.record();
		
		IMusicPlayer m = new SmartPhone();
		m.play();
		m.stop();
	}
}