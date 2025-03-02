
@SuppressWarnings("unchecked")
class ArrayClass<T>{
    private T[] data = (T[])new Object[10];
    int length = 0;
    public void append(T v){
        data[length++] = v;
    }
    public void display(){
        for (int i = 0; i < length; i++) {
            System.out.println(data[i]);
        }
    }
}


public class Main {
    public static void main(String[] args){
        ArrayClass<String> d1 = new ArrayClass<String>();
        d1.append("Omar");
        d1.append("Hamdi");
        d1.append("Abdelhaleam");
        d1.display();
    }
}