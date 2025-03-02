import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        Float[] list = {1.0f,1.1f,1.2f,1.3f,1.4f,1.5f,1.6f,1.7f,1.8f,1.9f};

        try(FileOutputStream fos = new FileOutputStream("Data.txt");
            DataOutputStream dos = new DataOutputStream(fos))
        {
            dos.writeInt(list.length);
            for(Float x: list){
                dos.writeFloat(x);
            }
        }

        try(FileInputStream fis = new FileInputStream("Data.txt");
            DataInputStream dis = new DataInputStream(fis))
        {
            int length = dis.readInt();

            while (length-- > 0){
                System.out.println(dis.readFloat());
            }
        }
    }
}