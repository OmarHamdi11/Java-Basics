import java.util.Scanner;
public class overloadReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-for number and 2-for array");
        int x= 2393;
        int arr[] = {1,2,3,4,5};
        int revX = reverse(x);
        System.out.println(revX);
        int revArr[] = reverse(arr);
        for(int y: revArr){
            System.out.print(y + " ");
        }


    }
    static int reverse(int number) {
        int temp=0;
        while (number != 0) {
            temp = temp * 10;
            temp += number % 10;
            number /= 10;
        }
        return temp;
    }
    static int[] reverse(int[] arr) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }
        return temp;
    }

    // static int[] reverse(int[] arr) {
    //     int temp[] = new int[arr.length];
    //     int j=arr.length-1;
    //     for (int i = 0; i < arr.length; i++) {
    //         temp[i] = arr[j--];
    //     }
    //     return temp;
    // }

}