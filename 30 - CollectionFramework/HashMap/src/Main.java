import java.util.*;

public class Main {
    public static void main(String[] args){
        HashMap<Integer,String> tm = new HashMap<>(Map.of(1,"omar",2,"ali",3,"ahmed",4,"osman"));


        System.out.println(tm.get(4));

        System.out.println(tm);
    }
}
