// Daemon Thread Method
//class MyThread extends Thread {
//    public void run(){
//        int c=1;
//        while(true){
//            System.out.println(c++);
//        }
//    }
//}
//
//
//public class Main{
//    public static void main(String[] args){
//        MyThread t1 = new MyThread();
//        t1.setDaemon(true);
//        t1.start();
//    }
//}

// Join Thread Method
//class MyThread extends Thread {
//    public void run(){
//        int c=1;
//        while(true){
//            System.out.println(c++);
//        }
//    }
//}
//
//
//public class Main{
//    public static void main(String[] args){
//        MyThread t1 = new MyThread();
//        t1.setDaemon(true);
//        t1.start();
//        Thread mainThread = Thread.currentThread();
//        try{
//            mainThread.join();
//        }catch(InterruptedException e){
//            System.out.println(e.getMessage());
//        }
//    }
//}


// Yield Thread Method
class MyThread extends Thread {
    public void run(){
        int c=1;
        while(true){
            System.out.println(c++ + "My Thread");
        }
    }
}


public class Main{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();

        int c=1;
        while(true){
            System.out.println(c++ + "Main");
//            Thread.yield();
        }
    }
}