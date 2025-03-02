import java.util.Scanner;

public class GCD{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        GCD gcd = new GCD();
        int greatestDivisor = gcd.greatestCommonDivisor(num1,num2);

        System.out.println("GCD is: "+greatestDivisor);
    }

    int greatestCommonDivisor(int num1,int num2){
        while(num1 != num2){
            if(num1 > num2){
                num1 = num1 - num2;
            }
            else if (num2 > num1) {
                num2 = num2 - num1;
            }
        }
        return num1;
    }


}