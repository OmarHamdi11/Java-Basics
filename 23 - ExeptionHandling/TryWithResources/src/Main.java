import java.io.*;
import java.util.Scanner;

public class Main {
    static void Divide() throws IOException{
        try(FileInputStream fi=new FileInputStream("D:\\Java\\Java_Projects_Abdulbary\\23 - ExeptionHandling\\TryWithResources\\src\\test.txt");
                Scanner sc=new Scanner(fi))
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a/b);
        }

    }

    public static void main(String[] args) throws IOException {
        Divide();
    }
}