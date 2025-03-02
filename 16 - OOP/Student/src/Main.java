public class Main {
    public static void main(String[] args) {
        Student s= new Student();
        s.roll=1;
        s.name="Omar";
        s.course="CS";
        s.m1=90;
        s.m2=95;
        s.m3=93;
        System.out.println("Total: "+s.total());
        System.out.println("Average: "+s.average());
        s.grade();
        System.out.println(s);
    }
}


class Student {
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public double average(){
        return (double)total()/3;
    }
    public void grade(){
        double avg = average();
        if (avg >= 90 ) {
            System.out.println("Excellent student");
        } else if (avg >= 80 ) {
            System.out.println("Grade out of 90");
        } else if (avg >= 70 ) {
            System.out.println("Grade out of 80");
        } else if (avg >= 60 ) {
            System.out.println("Grade out of 70");
        } else if (avg >= 50 ) {
            System.out.println("Grade out of 60");
        } else {
            System.out.println("Grade out of 50");
        }
    }
    public String toString(){
        return "Deteils: \n"+"RollNumber: "+roll+"\nName: "+name+"\nCourse: "+course;
    }
}