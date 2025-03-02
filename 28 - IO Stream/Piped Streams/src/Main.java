import java.io.*;

class Producer extends Thread{
    OutputStream os;
    Producer(OutputStream s){
        os=s;
    }
    @Override
    public void run(){
        int count = 1;
        while (true){
            try{
                os.write(count);
                os.flush();
                System.out.println("Producer: "+count);
                System.out.flush();
                Thread.sleep(1000);
                count++;
            } catch (Exception _){}
        }
    }
}

class Consumer extends Thread{
    InputStream is;
    Consumer(InputStream s){
        is=s;
    }
    @Override
    public void run(){
        int x;
        while (true){
            try{
                x=is.read();
                System.out.println("Consumer: "+x);
                System.out.flush();
                Thread.sleep(1000);
            } catch (Exception _){}
        }
    }
}


public class Main{
    public static void main(String[] args) throws Exception{
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        pis.connect(pos);

        p.start();
        c.start();
    }
}