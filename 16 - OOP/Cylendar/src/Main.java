public class Main {
    public static void main(String[] args) {
        Cylendar cylendar = new Cylendar();
        cylendar.radius=7;
        cylendar.height=10;
        System.out.println("lidArea= " + cylendar.lidArea());
        System.out.println("TotalSurfaceArea= " + cylendar.totalSurfaceArea());
        System.out.println("Volume= " + cylendar.volume());
    }
}

class Cylendar {
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+circumference()*radius;
    }
    public double volume(){
        return lidArea()*height;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
}