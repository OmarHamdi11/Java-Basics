import java.io.*;

class Student{
    int rollNo;
    String name;
    String dept;
}

public class Main{
    public static void main(String[] args) throws Exception{
        try(FileOutputStream fos = new FileOutputStream("Test.txt");
            PrintStream ps = new PrintStream(fos))
        {
            Student st = new Student();
            st.name = "Omar";
            st.dept = "CS";
            st.rollNo = 1;
            ps.println(st.rollNo);
            ps.println(st.name);
            ps.println(st.dept);
        }

        try(FileInputStream fis = new FileInputStream("Test.txt")){
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            Student st = new Student();

            st.rollNo = Integer.parseInt(br.readLine());
            st.name = br.readLine();
            st.dept = br.readLine();

            System.out.println(st.rollNo);
            System.out.println(st.name);
            System.out.println(st.dept);
        }

    }
}