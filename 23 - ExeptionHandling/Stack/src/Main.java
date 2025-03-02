class OverFlowException extends Exception {
    @Override
    public String toString(){
        return "OverFlow Exception";
    }
}

class UnderflowException extends Exception {
    @Override
    public String toString(){
        return "UnderFlow Exception";
    }
}

class Stack {
    private int top = -1;
    private final int numOfElements;
    private int[] arr;
    public Stack(int numOfElements){
        this.numOfElements = numOfElements;
        arr = new int[numOfElements];
    }

    public void push(int num) throws OverFlowException{
        top++;
        if (top>numOfElements-1){
            top--;
            throw new OverFlowException();
        }
        arr[top] = num;
    }
    public int pop() throws UnderflowException{
        top--;
        if (top==-1){
            top++;
            throw new UnderflowException();
        }
        return arr[top];
    }
    public void print(){
        for (int i = 0; i <= top; i++){
            System.out.println(arr[i]);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        try{
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            stack.push(60);
        } catch (OverFlowException s) {
            System.out.println(s.toString());
        }
    }
}