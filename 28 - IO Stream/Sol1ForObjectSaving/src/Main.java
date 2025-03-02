import java.io.*;

class Student{
    int rollNo;
    String name;
    String dept;
}

public class Main{
    public static void main(String[] args) throws Exception{
        try(FileOutputStream fos = new FileOutputStream("Test.txt");
            DataOutputStream dos = new DataOutputStream(fos))
        {
            Student st = new Student();
            st.name = "Omar";
            st.dept = "CS";
            st.rollNo = 1;
            dos.writeInt(st.rollNo);
            dos.writeUTF(st.name);
            dos.writeUTF(st.dept);
        }

        try(FileInputStream fis = new FileInputStream("Test.txt");
            DataInputStream dis = new DataInputStream(fis))
        {
            Student st = new Student();

            st.rollNo = dis.readInt();
            st.name = dis.readUTF();
            st.dept = dis.readUTF();

            System.out.println(st.rollNo);
            System.out.println(st.name);
            System.out.println(st.dept);
        }

    }
}