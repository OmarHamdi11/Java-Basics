
enum Dept{
    CS("Omar" , "Block A" , "H"),
    IS("Mariam" , "Block B" , "G"),
    AI("Osman" , "Block C" , "S"),
    BIO("Ali" , "Block D" , "T"),
    IT("Ahmed" , "Block E" , "X");
    final String name ;
    final String location ;
    final String dit;
    Dept(String name , String location , String dit){
        this.name = name;
        this.location = location;
        this.dit = dit;
    }
    public String getName(){
        return this.name;
    }
    public String getLocation(){
        return this.location;
    }
    public String getDit(){
        return this.dit;
    }
}
public class Main{
    public static void main(String[] args){
        Dept D = Dept.CS;
        System.out.println(D.getName());
        System.out.println(D.getLocation());
        System.out.println(D.getDit());

        /*
        System.out.println(D.ordinal());

        Dept[] list = Dept.values();
        for(Dept x: list){
            System.out.println(x);
        }
        */
    }
}