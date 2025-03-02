public class varArgsDiscount{
    public static void main(String[] args){
        System.out.println("Discount: " + discount(10,20,30,40) + "%");
    }

    static int discount(int ...A){
        int d=0;
        for(int i=0 ; i<A.length ; i++){
            d+= A[i];
        }
        if(d>=100){
            return 50;
        }
        else if(d>=50){
            return 30;
        }
        else{
            return 10;
        }
    }
}