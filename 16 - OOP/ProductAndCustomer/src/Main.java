class Product{
    private String itemNo;
    private String name;
    private double price;
    private int qty;
    public Product(String i,String n){
        itemNo=i;
        name=n;
    }
    public Product(String i, String n, double p, int q) {
        itemNo=i;
        name=n;
        price=p;
        qty=q;
    }
    public String getItemNo(){
        return itemNo;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setPrice(double p){
        price=p;
    }
    public void setQty(int q){
        qty=q;
    }
}




class Customer{
    private String customerId;
    private String customerName;
    private String address;
    private String phoneNo;
    public String getCustomerId(){
        return customerId;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public void setAddress(String a){
        address=a;
    }
    public void setPhoneNo(String n){
        phoneNo=n;
    }
    public Customer(String cId,String cName){
        customerId=cId;
        customerName=cName;
    }
    public Customer(String cId, String cName, String cAddress, String cPhoneNo){
        customerId=cId;
        customerName=cName;
        address=cAddress;
        phoneNo=cPhoneNo;
    }
}


















public class Main {
    public static void main(String[] args) {
    }
}