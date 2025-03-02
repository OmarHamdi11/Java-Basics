import java.util.*;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        a1.add(5);
        System.out.println(a1);
        a1.add(0,1);
        System.out.println(a1);
        a1.addAll(a2);
        System.out.println(a1);
        a1.addLast(100);
        System.out.println(a1);
        a1.addFirst(100);
        System.out.println(a1);
        System.out.println(a1.indexOf(12));
        a1.set(10,100);

        System.out.println(a1);
        /*
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (int i =0 ; i<a1.size(); i++)
            System.out.print(a1.get(i)+", ");
        System.out.println();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (Integer x:a1)
            System.out.print(x+", ");
        System.out.println();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (var x:a1)
            System.out.print(x+", ");
        System.out.println();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for (Iterator<Integer> it = a1.iterator(); it.hasNext();)
        {
            Integer x = it.next();
            System.out.print(x+ ", ");
        }
        System.out.println();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        a1.forEach((x) -> {
            System.out.print(x+", ");
        });
        System.out.println();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        ListIterator<Integer> lit = a1.listIterator();
        lit.next();
        System.out.println(lit.previous());
        */

        Iterator<Integer> it = a1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (Iterator<Integer> it2 = a1.iterator();it.hasNext();){
            System.out.println(it2.next());
        }

        a1.forEach(n-> System.out.println(n));
        a1.forEach(System.out::println);

        a1.forEach(n->show(n));
    }

    static void show (int n){
        if (n>=60)
            System.out.println(n);
    }
}