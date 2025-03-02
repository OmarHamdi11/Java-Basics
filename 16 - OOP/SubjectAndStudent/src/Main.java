class Subject{
    private String subjectId;
    private String subjectName;
    private int maxMarks;
    private int marksObtained;
    public Subject(String sId,String sName){
        subjectId=sId;
        subjectName=sName;
    }
    public Subject(String sId,String sName,int max){
        subjectId=sId;
        subjectName=sName;
        maxMarks=max;
    }
    public String getsubjectId(){
        return subjectId;
    }
    public String getSubjectName(){
        return subjectName;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtained(){
        return marksObtained;
    }
    public void setMaxMarks(int m){
        maxMarks=m;
    }
    public void setMarksObtained(int m){
        marksObtained=m;
    }
    public boolean isQualified(){
        return marksObtained>=maxMarks/10*4;
    }
    public String toString(){
        return "SubjectId: "+subjectId+"\nSubjectName: "+subjectName+"\nMarksObtained: "+marksObtained+"\n";
    }
}
class Student{
    private String rollNo;
    private String name;
    private String dep;
    private int noOfSubs;
    private Subject[] subs;
    Student(String rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }
    Student(String rollNo,String name,String dep,int noOfSubs){
        this.rollNo=rollNo;
        this.name=name;
        this.dep=dep;
        this.noOfSubs=noOfSubs;
    }
    public String getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getdep(){
        return dep;
    }
    public int getNoOfSubs(){
        return noOfSubs;
    }
    public Subject[] getSubjects(){
        return subs;
    }
    public void setDep(String dep){
        this.dep=dep;
    }
    public void setSubject(Subject ...sub){
        for(int i=0 ; i<sub.length ; i++){
            subs[i]=sub[i];
        }
    }
    public String toString(){
        return "RollNumber: "+rollNo+"\nName: "+name+"\nDepartment: "+dep+"\n";
    }
}




public class Main {
    public static void main(String[] args) {
        Subject s1[] = new Subject[3];
        s1[0]= new Subject("CS109","Java",100);
        s1[1]= new Subject("CS110","Algorithm",100);
        s1[2]= new Subject("CS111","DataStructure",100);
        for(Subject x:s1){
            System.out.println(x);
        }
    }
}