import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        FileInputStream fis1 = new FileInputStream("Source1.txt");
        FileInputStream fis2 = new FileInputStream("Source2.txt");
        FileOutputStream fos = new FileOutputStream("Destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);

        int x;
        while((x=sis.read())!=-1){
            fos.write((char)x);
        }

        fis1.close();
        fis2.close();
        sis.close();

    }
}