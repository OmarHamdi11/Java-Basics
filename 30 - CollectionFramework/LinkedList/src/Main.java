import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        LinkedList<Integer> l = new LinkedList<Integer>();

        l.push(10);
        l.push(20);
        l.push(30);
        l.push(40);
        l.push(50);
        l.push(60);
        int length = l.size();
        for (int i=0 ; i < length ; i++){
            System.out.println(l.pop());
        }
        System.out.println(l);
    }
}