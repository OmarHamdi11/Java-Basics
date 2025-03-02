import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        File f = new File("D:\\Java\\Java_Projects_Abdulbary\\1-Course Docs");
        System.out.println(f.lastModified());
        f.setWritable(true);
        FileOutputStream fos  = new FileOutputStream("D:\\Java\\Java_Projects_Abdulbary\\1-Course Docs");
        /*
        File f = new File("D:\\Java\\Java_Projects_Abdulbary\\1-Course Docs");
        System.out.println(f.isDirectory());
        File[] f2 = f.listFiles();
        for(File x:f2){
            System.out.print(x.getName() + "  ");
            System.out.println(x.getAbsolutePath());
        }
        */
    }
}