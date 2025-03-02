import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args){
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(1,"omar",2,"ali",3,"ahmed",4,"osman"));

        System.out.println(tm.ceilingEntry(2));

        System.out.println(tm.firstEntry());

        System.out.println(tm.get(4));

        Entry<Integer,String> e = tm.ceilingEntry(3);

        System.out.println("Entry key: "+e.getKey()+" ,Entry value: "+e.getValue());

        System.out.println(tm);
    }
}
