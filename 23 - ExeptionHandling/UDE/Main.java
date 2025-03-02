class LowBalanceException extends Exception {
	@Override
	public String toString(){
		return "Balance Should be >= 5000";
	}
}

class MaxBalanceException extends Exception{
	@Override
	public String toString(){
		return "Max balance should be 1000000";
	}
}


public class Main{
	static void fun1(){
		try{
			throw new LowBalanceException();
		} catch(LowBalanceException e){
			System.out.println(e.toString());
		}
	}
	static void fun2(){
		fun1();
		try{
			throw new MaxBalanceException();
		} catch (MaxBalanceException e){
			System.out.println(e.toString());
		}
	}
	static void fun3(){
		fun2();
	}
	public static void main(String [] args){
		fun3();
	}
}