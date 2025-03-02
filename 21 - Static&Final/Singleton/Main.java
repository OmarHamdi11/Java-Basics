class CoffeyMachine{
    private float coffeyQty;
    private float sugarQty;
    private float waterQty;
    private float MilkQty;
	static private CoffeyMachine instance = null;
    
    private CoffeyMachine(){
        coffeyQty = 0;
        sugarQty = 0;
        waterQty = 0;
        MilkQty = 0;
    }
    
    static public CoffeyMachine getInstance(){
		if(instance == null){
			instance = new CoffeyMachine();
		}
		return instance;
	}
}

public class Main{
	public static void main(String[] args){
		CoffeyMachine m1 = CoffeyMachine.getInstance();
		CoffeyMachine m2 = CoffeyMachine.getInstance();
		CoffeyMachine m3 = CoffeyMachine.getInstance();
		
		System.out.println("m1: "+m1+"\nm2: "+m2+"\nm3: "+m3);
		if(m1==m2 && m1==m3){
			System.out.println("Same objects");
		}
	}
}