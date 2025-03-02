public class Main{
    public static void main(String[] args){
        Rectangle2 r = new Rectangle2();
        r.setLength(10);
        r.setBreadth(10);
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
    public void setLength(double l){
        if(l>=0) length=l;
        else System.out.println("Error, invalid Number");
    }
    public void setBreadth(double b){
        if(b>=0) breadth=b;
        else System.out.println("Error, invalid Number");
    }
    public double getLength(){return length;}
    public double getBreadth(){return breadth;}
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