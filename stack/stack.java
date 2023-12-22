package stack;

public class stack {
    private static final int  DEFAULT_SIZE = 10;
    int ptr = -1;
    protected int[] arr;

    public stack(){
        this(DEFAULT_SIZE);
    }
    public stack(int n){
        this.arr = new int[n];
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean push(int n){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr ++;
        arr[ptr] = n;
        return false;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        int n = arr[ptr];
        ptr--;
        return n;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty!!");
        }
        return arr[ptr];
    }

    public boolean isFull(){
        return ptr == arr.length-1;
    }
}
