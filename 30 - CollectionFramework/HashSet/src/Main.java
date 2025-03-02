import java.util.*;

public class Main{
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>(16,.5f);
        hs.add(10);
        hs.add(23);
        hs.add(54);
        hs.add(28);
        hs.add(60);
        hs.add(10);

        System.out.println(hs);
        System.out.println(hs.size()); // it doesn't count blanks "unused spaces"

    }
}