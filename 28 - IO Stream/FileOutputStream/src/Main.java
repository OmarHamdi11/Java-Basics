import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        //FileOutputStream
        /*
        try(FileOutputStream file = new FileOutputStream("Test.txt")){
            String str= "This is my first io stream project";
            byte[] b = str.getBytes();
            file.write(b);
        }
        */
        /*
        try{
            FileOutputStream file = new FileOutputStream("Test.txt");

            String str = "This is my first io stream program";

            byte[] b = str.getBytes();

            for(byte x:b)
                file.write(x);

            file.write(str.getBytes());

            file.write(str.getBytes() , 8 , str.length()-8);

            file.write(b);
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        */

        //FileInputStream
        /*
        try(FileInputStream file = new FileInputStream("Test.txt")){
            byte[] b = new byte[file.available()];
            file.read(b);
            String str = new String(b);
            System.out.println(str);
        }
        */
        /*
        try(FileInputStream file = new FileInputStream("Test.txt")){
            int x;
            while((x= file.read())!=-1){
                System.out.print((char)x);
            }
        }
        */

        //FileWriter and FileReader
        /*
        try(FileWriter file = new FileWriter("Test2.txt")){
            String str = "First try for file writer and reader";
            //byte[] b = str.getBytes();
            file.write(str);
        }

        try(FileReader file = new FileReader("Test2.txt")){
            int x;
            while((x=file.read())!=-1){
                System.out.print((char)x);
            }
        }
        */
    }
}