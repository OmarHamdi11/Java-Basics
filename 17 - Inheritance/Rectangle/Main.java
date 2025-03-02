class Rectangle{
	public int length; 
	public int breadth;
	public Rectangle(){
		length = breadth = 1;
	}
	public Rectangle(int length , int breadth){
		this.length = length;
		this.breadth = breadth;
	}
}	


class Cuboid extends Rectangle{
	public int height;
	public Cuboid(){
		height = 1;
	}
	public Cuboid(int height){
		this.height = height;
	}
	public Cuboid(int height , int length , int breadth){
		super(length , breadth);
		this.height = height;
	}
	public double volume(){
		return height*length*breadth;
	}
}


public class Main{
	public static void main(String[] args){
		Cuboid c = new Cuboid(10,5,15);
		System.out.println("Cuboid Volume: "+c.volume());
	}
}