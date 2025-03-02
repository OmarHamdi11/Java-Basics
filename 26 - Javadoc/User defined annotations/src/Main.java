import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD,ElementType.LOCAL_VARIABLE})
@interface MyAnno{
  String name();
  String date();
  String version() default "13";
}

public class Main{
    @MyAnno(name="omar",date="3/2/2025",version="23")
    public static void main(String[] args){

        @MyAnno(name="omar",date="3/2/2025",version="23")
        int x=10;

    }
}