public class Circle1 {
    public static void main(String[] args) {
        circle circle = new circle();
        circle.radius = 10;
        System.out.println("Area= " + circle.area());
        System.out.println("Perimeter= " + circle.perimeter());
        System.out.println("Circumference= " + circle.circumference());
    }
}

class circle {
    public double radius;
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference(){
        return perimeter();
    }

}