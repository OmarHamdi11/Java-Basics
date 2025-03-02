import java.io.*;

class Student implements Serializable
{
    Student(){}
    int rollNo;
    String name;
    String dept;
}

public class Main{
    public static void main(String[] args) throws Exception{
        try(FileOutputStream fos = new FileOutputStream("Test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            Student st = new Student();
            st.name = "Omar";
            st.dept = "CS";
            st.rollNo = 1;
            oos.writeObject(st);
        }

        try(FileInputStream fis = new FileInputStream("Test.txt")){
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student st  = (Student)ois.readObject() ;

            System.out.println(st.rollNo);
            System.out.println(st.name);
            System.out.println(st.dept);
        }

    }
}