
public class change{
    public static void main(String[] args){
        int A[]={ 1 , 2 , 3 , 4 , 5 };

        changeValue(A,2,100);

        for(int x: A){
            System.out.print(x + " ");
        }
        System.out.println("");

        int x =10;
        changeValue2(x , 30);
        System.out.println("Actual Parameter value = " + x);
    }

    static void changeValue(int A[] , int index , int newValue){
        A[index] = newValue;
    }

    static void changeValue2 (int a , int newValue) {
        a = newValue;
        System.out.println("Formal Parameter value = " + a );
    }
}