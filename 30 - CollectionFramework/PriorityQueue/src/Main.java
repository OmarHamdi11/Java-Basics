import java.util.*;

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1,Integer o2){
        if (o1>o2) return 1;
        if (o1<o2) return -1;
        return 0;
    }
}

public class Main {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new MyComparator());
        pq.add(10);
        pq.add(15);
        pq.add(7);
        pq.add(2);
        pq.add(20);
        pq.add(5);

        System.out.println(pq.peek());
        System.out.println(pq);

        /*
        pq.forEach(x-> System.out.println(x));
        pq.forEach(System.out::println);
        */

        pq.poll();
        System.out.println(pq);
    }
}

/*
import java.util.*;

public class Main{
    public static void main(String[] args){

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(100);
        pq.add(42);
        pq.add(45);
        pq.add(58);
        pq.add(56);
        pq.add(20);
        pq.add(27);
        pq.add(0);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);


        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        pq.add(10);
        pq.add(100);
        pq.add(42);
        pq.add(45);
        pq.add(58);
        pq.add(56);
        pq.add(20);
        pq.add(27);
        pq.add(0);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);


        PriorityQueue<String> pq = new PriorityQueue<String>(Comparator.comparingInt(String::length));
        pq.add("10");
        pq.add("omar");
        pq.add("ahmed");
        pq.add("ali");

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);


    }
}

*/