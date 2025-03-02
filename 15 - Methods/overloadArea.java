import java.util.Scanner;

public class overloadArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-for circle and 2-for rectangular");
        int choise = sc.nextInt();
        double Area;
        if(choise == 1){
            System.out.println("Enter Radius : ");
            double r = sc.nextDouble();
            Area = area(r);
        }
        else {
            System.out.println("Enter length & width : ");
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            Area = area(l,w);
        }
        System.out.print("Area = " + Area);
    }

    static double area(double length , double width){
        return length*width;
    }
    static double area(double radius){
        return Math.PI*radius*radius;
    }
    
}