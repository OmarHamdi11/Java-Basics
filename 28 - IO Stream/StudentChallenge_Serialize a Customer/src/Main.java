import java.io.*;
import java.util.Scanner;

class Customer implements Serializable{
    String customerId;
    static int count = 0;
    String name;
    String phone;
    Customer(){}
    Customer(String name , String phone){
        customerId = "C"+count++;
        this.name = name;
        this.phone = phone;
    }
    public String toString(){
        return "\nCustomer ID: " + customerId + "\nName: " + name + "\nPhone:" + phone ;
    }
}

public class Main{
    public static void main(String[] args) throws Exception{
        try(FileOutputStream fos  = new FileOutputStream("Customers.txt");
            ObjectOutputStream oos =new ObjectOutputStream(fos))
        {
            Customer[] customers = {
                    new Customer("omar" , "01155032546"),
                    new Customer("mohamed" , "0115462546"),
                    new Customer("osman" , "01152902546"),
                    new Customer("ahmed" , "01153552546"),
                    new Customer("ali" , "01152002546"),
                    new Customer("yousef" , "01154582546"),
            };
            oos.writeInt(customers.length);
            for(Customer c: customers){
                oos.writeObject(c);
            }
        }

        /*
        try(FileInputStream fis  = new FileInputStream("Customers.txt");
            ObjectInputStream oos =new ObjectInputStream(fis))
        {
            int length = oos.readInt();
            while(length-- > 0){
                System.out.println((Customer)oos.readObject());
            }
        }
        */

        try(FileInputStream fis  = new FileInputStream("Customers.txt");
            ObjectInputStream ois =new ObjectInputStream(fis))
        {
            Scanner sc = new Scanner(System.in);

            int length = ois.readInt();
            Customer[] customers = new Customer[length];

            for(int i = 0 ; i<length ; i++){
                customers[i] = (Customer)ois.readObject();
            }

            System.out.print("Enter Customer name: ");
            String name = sc.nextLine();

            for (Customer c: customers){
                if (name.equalsIgnoreCase(c.name)){
                    System.out.println(c);
                }
            }
        }


    }
}