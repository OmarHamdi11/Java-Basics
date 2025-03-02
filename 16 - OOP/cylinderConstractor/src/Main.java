class Cylinder {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double r){
        radius = r;
    }
    public void setHeight(double h){
        height = h;
    }
    public void setDimensions(double r, double h){
        setRadius(r);
        setHeight(h);
    }
    public Cylinder(){
        radius = 1.0;
        height = 1.0;
    }
    public Cylinder(double r, double h){
        radius = r;
        height = h;
    }
    public Cylinder(double r){
        radius = r;
        height = 1.0;
    }
    public double lidArea(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double drumArea(){
        return 2*lidArea()+perimeter()*height;
    }
    public double volume(){
        return lidArea()*height;
    }
}


public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setDimensions(10,20);
        System.out.println("Area: "+ cylinder.lidArea());
        System.out.println("Circumference: "+cylinder.perimeter());
        System.out.println("TotalSurfaceArea : "+cylinder.drumArea());
        System.out.println("Volume: "+cylinder.volume());
        System.out.println("Radius: "+cylinder.getRadius());
        System.out.println("height: "+cylinder.getHeight());

    }
}

