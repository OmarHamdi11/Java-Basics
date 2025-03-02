class MyData{
    int count = 0;
    boolean flag= true;
    synchronized public void set(int c){
        while(flag!=true){
            try{wait();}catch(Exception _){}
        }
        count = c;
        flag = false;
        notify();
    }
    synchronized public int get(){
        int x=0;
        while(flag!=false){
            try{wait();}catch(Exception e){}
        }
        x=count;
        flag = true;
        notify();

        return x;
    }
}

class Producer extends Thread{
    MyData data;
    public Producer(MyData d){
        data=d;
    }
    public void run(){
        int value =1;
        while(true){
            data.set(value);
            System.out.println("Producer set: " + value);
            value++;
        }
    }
}

class Consumer extends Thread{
    MyData data;
    public Consumer(MyData d){
        data=d;
    }
    public void run(){
        int value;
        while(true){
            value = data.get();
            System.out.println("Consume get: " + value);
        }
    }
}

public class Main{
    public static void main(String[] args){
        MyData data = new MyData();
        Producer p = new Producer(data);
        Consumer c  = new Consumer(data);

        p.start();
        c.start();
    }
}