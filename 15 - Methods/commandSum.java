public class commandSum{
	public static void main(String[] args){
		double s=0;
		for (String a:args){
			if(a.matches("[0-9\\.]+")){
				s+=Double.parseDouble(a);
			}
		}
		System.out.println("Sum: "+s);
	}
}