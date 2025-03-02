
public class challenge1{
	public static void main(String args[]){
		String str = "omarellafy1@gmail.com";
		
		int index = str.indexOf("@");
		String userName,domainName;
		
		userName = str.substring(0,index);
		domainName = str.substring(index+1);
		
		System.out.println("User Name: " + userName);
		System.out.println("Domain Name: " + domainName);
		System.out.println("Is domain is gmail? => " + domainName.matches("gmail.*"));
		
	}
	
	
	
	
	/*
	
	
	public static void main(String[] args) 
    {
      String str="programmer@gmail.com";
      //String str="programmer@hotmail.com";
      
      int i=str.indexOf("@");
      String uname=str.substring(0,i);
      String domain=str.substring(i+1, str.length());
      
      System.out.println("Username :"+uname);
      System.out.println("Domain :"+domain);
      
      int j=domain.indexOf(".");
      String name=domain.substring(0, j);
      System.out.println(name.equals("gmail"));
    }
	
	
	
	*/
}