class Account{
	private String accNo;
	private String name;
	private String address;
	private String phoneNo;
	private String dateOfBirth;
	public double balance;
	
	public String getAccNo(){return accNo;}
	public String getName(){return name;}
	public String getAddress(){return address;}
	public String getPhoneNo(){return phoneNo;}
	public String getDateOfBirht(){return dateOfBirth;}
	public double getBalance(){return balance;}
	
	public void setAccNo(String accNo){this.accNo = accNo;}
	public void setName(String name){this.name = name;}
	public void setAddress(String address){this.address = address;}
	public void setPhoneNo(String phoneNo){this.phoneNo = phoneNo;}
	public void setDateOfBirth(String dateOfBirth){this.dateOfBirth = dateOfBirth;}
	
	public Account(){
		accNo = "Unknown";
		name  = "Unknown";
		address = "Unknown";
		phoneNo = "Unknown";
		dateOfBirth = "Unknown";
		balance = 0;
	}
	public Account(String accNo , String name , String address , String phoneNo , String dateOfBirth , double balance){
		setAccNo(accNo);
		setName(name);
		setAddress(address);
		setPhoneNo(phoneNo);
		setDateOfBirth(dateOfBirth);
		this.balance = balance;
	}
	public Account(String accNo , String name , double balance){
		setAccNo(accNo);
		setName(name);
		setAddress("Unknown");
		setPhoneNo("Unknown");
		setDateOfBirth("Unknown");
		this.balance = balance;
	}
	
	public void close(){
		System.out.println("Account has been closed");
	}
}


class LoanAccount extends Account{
	public LoanAccount(){}
	public void payEMI(long amt)
	{
		balance-=amt;
	}
	public void repay(long amt)
	{
	if(balance==amt)
		balance=0;
	}
}


class SavingAccount extends Account{
	public SavingAccount(){}
	public void deposit(long amt)
	{
		balance+=amt;
	}
	public void withdraw(long amt)
	{
		balance-=amt;
	}
}


public class Main{
	public static void main(String[] args){
		
	}
}