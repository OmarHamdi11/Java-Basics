
public class overloadValidate{
    public static void main(String[] args){
        int age = 95;
        String name = "oma4r";
        System.out.println(validate(name)?"valid name":"not valid name");
        System.out.println(validate(age)?"valid age":"not valid age");
    }

    static boolean validate (String name){
        return name.matches("[a-zA-Z]*");
    }

    static boolean validate (int age){
        return age>=3&&age<=15;
    }
}