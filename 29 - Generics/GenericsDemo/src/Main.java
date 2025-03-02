
public class Main<T>{
    T[] data = (T[]) new Object[3];
    public static void main(String[] args){
        Main<String> m = new Main<String>();
        m.data[0] = "Hello";
        m.data[1] = "Hi";
        m.data[2] = "Bye";
    }
}