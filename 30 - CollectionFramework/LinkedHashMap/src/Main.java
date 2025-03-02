import java.util.*;

public class Main{
    public static void main(String[] args){
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,.75f,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");

        String s = lhm.get(3);
        s = lhm.get(1);
        lhm.put(6,"F");

        System.out.println(lhm);
    }
}