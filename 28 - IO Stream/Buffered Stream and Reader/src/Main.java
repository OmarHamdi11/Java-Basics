import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        //Buffered Stream
        /*
        FileInputStream fis = new FileInputStream("Test.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        System.out.println("File mark supported ? " + fis.markSupported());
        System.out.println("buffer mark supported ? " + bis.markSupported());

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        */

        //Buffered Reader
        FileReader fis = new FileReader("Test.txt");
        BufferedReader bis = new BufferedReader(fis);
        System.out.println("File mark supported ? " + fis.markSupported());
        System.out.println("buffer mark supported ? " + bis.markSupported());

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read() + "\n" );

        System.out.println(bis.readLine());
    }
}