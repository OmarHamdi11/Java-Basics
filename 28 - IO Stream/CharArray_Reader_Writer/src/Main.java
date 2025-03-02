import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{

        //CharArrayReader
        /*
        char[] b = {'a','b','c','d','e','f','j','h','i','j','k'};
        CharArrayReader car = new CharArrayReader(b);
        int x;
        while((x=car.read())!=-1)
            System.out.print((char)x);

        car.close();
        */

        //CharArrayWriter
        /*
        CharArrayWriter caw = new CharArrayWriter();
        caw.write('a');
        caw.write('b');
        caw.write('c');
        caw.write('d');
        char[] b = caw.toCharArray();
        for (char x:b)
            System.out.println((char)x);
        */
    }
}