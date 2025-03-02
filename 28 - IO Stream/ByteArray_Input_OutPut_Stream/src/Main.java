import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{

        //ByteArrayInputStream
        /*
        byte[] b = {'a','b','c','d','e','f','j','h','i','j','k'};
        ByteArrayInputStream bais = new ByteArrayInputStream(b);
        String str = new String(bais.readAllBytes());
        System.out.println(str);
        bais.close();
        */

        //ByteArrayOutputStream
        /*
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write('a');
        baos.write('b');
        baos.write('c');
        baos.write('d');
        byte[] b = baos.toByteArray();
        for (byte x:b)
            System.out.println((char)x);
        */


    }
}