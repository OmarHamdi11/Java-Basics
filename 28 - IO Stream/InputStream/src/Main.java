import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("Test.txt");
        //byte[] b = new byte[fis.available()];
        //fis.read(b);
        //String str= new String(b);
        //System.out.println(str);

        //int x;
        //while((x= fis.read())!=-1){
        //    System.out.print((char)x);
        //}

        byte[] b = new byte[fis.available()];
        fis.read(b,10,15);
        String str= new String(b);
        System.out.println(str);

    }
}