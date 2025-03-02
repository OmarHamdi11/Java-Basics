class WhiteBoard{
    String text;
    int noOfStudents = 0;
    int count = 0;

    public void attendance(){
        noOfStudents++;
    }

    synchronized public void write(String t){
        System.out.println("Teacher write: " + t);
        while(count!=0){
            try{wait();}catch(Exception _){}
        }
        text = t;
        count = noOfStudents;
        notifyAll();
    }

    synchronized public String read(){
        String txt;
        while(count == 0){
            try{wait();}catch(Exception _){}
        }
        txt = text;
        count--;
        if(count == 0){
            notify();
        }
        return txt;
    }
}

class Teacher extends Thread{
    WhiteBoard board;
    String[] str = {
            "Java is a very strong programming language",
            "it's a oop language",
            "java use multithreading",
            "end"
    };
    public Teacher(WhiteBoard board){
        this.board = board;
    }
    @Override
    public void run(){
        for(String s : str){
            board.write(s);
        }
    }
}

class Student extends Thread{
    String name;
    WhiteBoard board;
    Student(String name ,WhiteBoard board){
        this.name = name;
        this.board = board;
    }
    @Override
    public void run(){
        board.attendance();
        String txt;

        do{
            txt = board.read();
            System.out.println("Student " + name + " read: " + txt);
            System.out.flush();;
        }
        while(!txt.equals("end"));
    }
}

public class Main{
    public static void main(String[] args){
        WhiteBoard board = new WhiteBoard();
        Teacher t = new Teacher(board);

        Student s1 = new Student("Omar" , board);
        Student s2 = new Student("Mariam" , board);
        Student s3 = new Student("Osman" , board);
        Student s4 = new Student("Ali" , board);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
}