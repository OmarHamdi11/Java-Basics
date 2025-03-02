import java.util.*;
import java.time.LocalDate;

class Student{
	private String rollNo;
	private static int count=1;
	private String generateRollNo(){
		int year = LocalDate.now().getYear();
		String m = "Uni"+year+count;
		count++;
		return m;
	}
	public Student(){
		rollNo = generateRollNo();
	}
	public String getRollNo(){
		return rollNo;
	}
}

public class Main{
	public static void main(String[] args){
		Student st1 = new Student();
		System.out.println("Student rollNo: " + st1.getRollNo());
		Student st3 = new Student();
		System.out.println("Student rollNo: " + st3.getRollNo());
		Student st4 = new Student();
		System.out.println("Student rollNo: " + st4.getRollNo());
		Student st5 = new Student();
		System.out.println("Student rollNo: " + st5.getRollNo());
		Student st6 = new Student();
		System.out.println("Student rollNo: " + st6.getRollNo());
		
		
	}
}