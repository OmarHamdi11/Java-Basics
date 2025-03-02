public class Main{
    public static void main(String[] args){
        Rectangle2 r = new Rectangle2(30,40);
        System.out.println("Area= " + r.area());
        System.out.println("Perimeter= " + r.perimeter());
        if(r.isSquare()){
            System.out.println("Is a Square");
        }
        else{
            System.out.println("Not a Square");
        }
        System.out.println("Length= "+r.getLength());
        System.out.println("Breadth= "+r.getBreadth());
    }
}

class Rectangle2{
    private double length;
    private double breadth;
    public Rectangle2(){
        length=1;
        breadth=1;
    }
    public Rectangle2(double l, double b){
        length = l;
        breadth = b;
    }
    public Rectangle2(double side){
        length = breadth = side;
    }
    public void setLength(double l){
        if(l>=0) length=l;
        else length=0;
    }
    public void setBreadth(double b){
        if(b>=0) breadth=b;
        else breadth=0;
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public double area(){
        return getLength()*getBreadth();
    }
    public double perimeter(){
        return 2*(getLength()+getBreadth());
    }
    public boolean isSquare(){
        return getLength() == getBreadth();
    }
}