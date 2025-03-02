
class Data <T>{
    private T data;
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
}

public class Main {
    public static void main(String[] args){
        Data<String> d1 = new Data<String>();
        d1.setData("Hello String Generic");
        System.out.println(d1.getData());

        Data<Integer> d2 = new Data<Integer>();
        d2.setData(10);
        System.out.println(d2.getData());

        Data<Float> d3 = new Data<Float>();
        d3.setData(10.34f);
        System.out.println(d3.getData());


    }
}