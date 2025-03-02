class MyData{
     /*synchronized */public void display(String str){
        synchronized(this){
            for(int i=0 ; i< str.length(); i++){
                System.out.print(str.charAt(i));
                try{Thread.sleep(1000);}catch(Exception e){}
            }
        }
    }
}

class Thread1 extends Thread{
    MyData d;
    public Thread1(MyData data){d=data;}
    public void run(){d.display("HelloWorld");}
}

class Thread2 extends Thread{
    MyData d;
    public Thread2(MyData data){d=data;}
    public void run(){d.display("OmarEllafy");}
}

public class Main{
    public static void main(String[] args){
        MyData d = new MyData();
        Thread1 t1 = new Thread1(d);
        Thread2 t2 = new Thread2(d);
        t1.start();
        t2.start();
    }
}