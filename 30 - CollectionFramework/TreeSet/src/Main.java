import java.util.*;

public class Main{
    public static void main(String[] args){
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,23,5,6,21,657));
        ts.add(26);
        System.out.println(ts);
        System.out.println(ts.ceiling(40));
    }
}