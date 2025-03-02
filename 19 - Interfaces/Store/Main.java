interface member{
	void callBack();
}

class Customer implements member{
	String name;
	Customer(String n){name = n;}
	public void callBack(){System.out.println("ok, " + name);}
}

class Store{
	member mem[] = new member[100];
	int count = 0;
	void register(member m){mem[count++] = m;}
	void inviteSale(){
		for(int i =0 ; i<count ; i++){
			mem[i].callBack();
		}
	}
}

public class Main{
	public static void main(String[] args){
		Store st = new Store();
		Customer c1 = new Customer("Omar");
		Customer c2 = new Customer("Osman");
		
		st.register(c1);
		st.register(c2);
		
		st.inviteSale();
	}
}