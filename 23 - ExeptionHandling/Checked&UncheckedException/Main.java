import java.io.*;

public class Main{
	static void fun1(){
		try{
			int x = 20/0;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	static void fun2(){
		fun1();
		FileInputStream f1 = new FileImageInputStream("myFile.txt");
	}
	static void fun3(){
		fun2();
	}
	public static void main(String [] args){
		fun3();
	}
}