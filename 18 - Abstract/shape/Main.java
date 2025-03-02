abstract class Shape{
	abstract public double perimeter();
	abstract public double area();
}

class Circle extends Shape{
	public double radius;
	public double perimeter(){
		return 2 * Math.PI * radius;
	}
	public double area(){
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape{
	public double length;
	public double breadth;
	public double perimeter(){
		return 2*(length+breadth);
	}
	public double area(){
		return length * breadth;
	}
}

public class Main{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle();
		r1.length = 10;
		r1.breadth = 20;
		System.out.println("Area: " + r1.area());
		System.out.println("Perimeter: " + r1.perimeter());
		
		Shape s = r1;
		System.out.println(s.perimeter());
	}
}