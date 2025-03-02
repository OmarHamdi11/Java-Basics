import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        boolean prime = isPrime(num);

        if(prime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Non Prime Number");
        }
        
    }

    static boolean isPrime(int num){
        for (int i = 2 ; i<num/2 ; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}