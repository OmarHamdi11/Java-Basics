import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        System.out.println(dq);

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);

        System.out.println(dq);
    }
}