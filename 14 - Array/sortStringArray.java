public class sortStringArray{
    public static void main(String[] args){
        String arr[] = {"Ehab" ,"Ahmed" , "Fatma", "Basem" , "Doaa" ,  "Camel"  };

         java.util.Arrays.sort(arr);

        for(String x : arr){
           System.out.print(x+" ");
        }
    }
}