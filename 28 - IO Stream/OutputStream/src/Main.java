import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{

        FileOutputStream fos = new FileOutputStream("Test.txt");
        String str = "Hello now we will focus on\nhow to deal with output streams";
        byte[] b = str.getBytes();
        //for (byte x:b)
        //    fos.write(x);
        //fos.write(b , 10 , str.length()-11);
        fos.write(b);
        fos.close();

    }
}