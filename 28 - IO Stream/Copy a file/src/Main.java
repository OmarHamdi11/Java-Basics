import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        /*
        try(FileOutputStream file = new FileOutputStream("Resource1.txt")){
            String str = "JAVA\n";
            String str2 = "PROGRAMMING";
            byte[] c1 = str.getBytes();
            byte[] c2 = str2.getBytes();
            file.write(c1);
            file.write(c2);
        }

        String output;

        try(FileInputStream file = new FileInputStream("Resource1.txt")){
            byte[] c = new byte[file.available()];
            file.read(c);
            String str = new String(c);
            output = str;
            System.out.println(str);
        }

        output = output.toLowerCase();
        System.out.println(output);


        try(FileOutputStream file = new FileOutputStream("Resource2.txt")){
            byte[] c ;
            c = output.getBytes();
            file.write(c);
        }

        try(FileInputStream file = new FileInputStream("Resource2.txt")){
            byte[] b= new byte[file.available()];
            file.read(b);
            String str = new String(b);
            System.out.println(str);
        }
        */

        FileInputStream fis = new FileInputStream("Source1.txt");
        FileOutputStream fos = new FileOutputStream("Source2.txt");
        int x;
        while((x=fis.read())!=-1){
            if(x>=65&&x<=90)
                fos.write(x+32);
            else
                fos.write(x);
        }
        fis.close();
        fos.close();
    }
}