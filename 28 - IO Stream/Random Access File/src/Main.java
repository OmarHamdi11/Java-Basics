import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args){
        try{
            RandomAccessFile raf = new RandomAccessFile("Test.txt" , "rw");
            System.out.println((char)raf.read());
            System.out.println((char)raf.read());
            System.out.println((char)raf.read());
            raf.write('d');
            System.out.println((char)raf.read());
            System.out.println((char)raf.read());
            raf.skipBytes(3);
            System.out.println((char)raf.read());
            raf.seek(3);
            System.out.println((char)raf.read());
            System.out.println(raf.getFilePointer());
            raf.seek(raf.getFilePointer()+2);
            System.out.println(raf.getFilePointer());
            System.out.println((char)raf.read());
            raf.close();
        }catch(IOException _){}
    }
}