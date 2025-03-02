//
//class MyThread extends Thread {
//    public MyThread(String name){
//        super(name);
//        setPriority(Thread.NORM_PRIORITY);
//    }
//}
//
//
//public class Main{
//    public static void main(String[] args){
//        MyThread t1 = new MyThread("Test Thread1");
//
//        System.out.println("ID: " + t1.threadId());
//        System.out.println("Name: " + t1.getName());
//        System.out.println("Priority: " + t1.getPriority());
//        t1.start();
//        System.out.println("State: " + t1.getState());
//        System.out.println("IsAlive?: " + t1.isAlive());
//
//
//
//    }
//}



class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int c=1;
        while(true){
            System.out.println(c++);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}


public class Main{
    public static void main(String[] args){
        MyThread t1 = new MyThread("Test Thread1");
        t1.start();
        t1.interrupt();
    }
}