/*
class MyThread extends Thread {
    String n;
    public MyThread(String name) {
        n = name;
    }
    public void run(){
        int x = 0;
        while (true){
            System.out.println(n);;
        }
    }
}

public class Main{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Omar");
        t1.start();

        MyThread t2 = new MyThread("Hamdi");
        t2.start();

        MyThread t3 = new MyThread("Ellafy");
        t3.start();
    }
}
*/

public class Main extends Thread{
	public void run(){
		int x = 0;
        while (true){
			x++;
            System.out.println(x + "- Hello");;
        }
	}
    public static void main(String[] args) {
        Main m = new Main();
        m.start();
		
		int x = 0;
        while (true){
			x++;
            System.out.println(x + "- World");;
        }
    }
}