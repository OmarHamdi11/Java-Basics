class ATM{
    synchronized public void checkBalance(String name){
        System.out.println(name + "-CheckBalance");
    }
    synchronized public void withDraw(String name , int amount){
        System.out.println(name + "-WithDraw-" + amount);
    }
}

class Customer extends Thread{
    ATM atm;
    String name;
    int amount;
    public Customer(ATM atm ,String name , int amount){
        this.atm = atm;
        this.name = name;
        this.amount=amount;
    }
    public void run(){
        atm.checkBalance(name);
        atm.withDraw(name , amount);
    }
}

public class Main{
    public static void main(String [] args){
        ATM atm = new ATM();
        Customer c1 = new Customer(atm , "Omar" , 2000);
        Customer c2 = new Customer(atm , "Osman" , 4000);
        Customer c3 = new Customer(atm , "Ali" , 6000);
        c1.start();
        c2.start();
        c3.start();
    }
}
