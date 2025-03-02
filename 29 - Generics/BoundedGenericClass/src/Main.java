
class A{}
class B extends A{}
class C extends A{}

interface D{}
class E implements D{}
class F implements D{}


class ArrayClass<T extends Number>{}
class ArrayClass2<T extends A>{}
class ArrayClass3<T extends D>{}



public class Main {
    public static void main(String[] args){
        ArrayClass<Number> d1 = new ArrayClass<Number>();
        ArrayClass<Integer> d2 = new ArrayClass<Integer>();
        ArrayClass<Float> d3 = new ArrayClass<Float>();


        ArrayClass2<A> d4 = new ArrayClass2<A>();
        ArrayClass2<B> d5 = new ArrayClass2<B>();
        ArrayClass2<C> d6 = new ArrayClass2<C>();


        ArrayClass3<D> d7 = new ArrayClass3<D>();
        ArrayClass3<E> d8 = new ArrayClass3<E>();
        ArrayClass3<F> d9 = new ArrayClass3<F>();



    }
}